#!/bin/sh

DRY_RUN=
RELEASE_VERSION=
NEXTDEV_VERSION=

while test $# -gt 0; do
        case "$1" in
                -h|--help)
                        echo "release.sh - release project"
                        echo " "
                        echo "release.sh [options]"
                        echo " "
                        echo "options:"
                        echo "-h, --help                show brief help"
                        echo "-t, dry run, test release process without commit to git"
                        echo "-r, release version"
                        echo "-d, next development version (do not use -SNAPSHOT suffix, it is added automatically)"
                        exit 0
                        ;;
                -t)
                        shift
                        DRY_RUN=true
                                               
                        ;;
                -r)
                        shift
                        if test $# -gt 0; then
                                RELEASE_VERSION=$1
                        else
                                echo "no release version specified"
                                exit 1
                        fi
                        shift
                        ;;
				-d)
                        shift
                        if test $# -gt 0; then
                                NEXTDEV_VERSION=$1
                        else
                                echo "no next version specified"
                                exit 1
                        fi
                        shift
                        ;;

                *)
                        break
                        ;;
        esac
done

if [ ! "$RELEASE_VERSION" ]; then
    echo "ERROR: release version specified. See -h" >&2
    exit 1
fi


if [ ! "$NEXTDEV_VERSION" ]; then
    echo "ERROR: next dev version specified. See -h" >&2
    exit 1
fi


echo "Releasing project. Release version $RELEASE_VERSION , next version $NEXTDEV_VERSION-SNAPSHOT"

if [ "$DRY_RUN" ]; then
	echo "Dry run mode, no changes will be commited"
fi

gitChanges=`git status --porcelain | wc -l`

if [ "$gitChanges" -gt 0 ] && [ ! "$DRY_RUN" ]; then
	echo "there are uncommited changes, abort"
	exit 1
fi

projectName="com.evrasoft.jcr"
releaseDir="$projectName.releases"
updatesiteDir="$projectName.updatesite"

echo "Building target platform"
cd ../../releng/com.evrasoft.jcr.repository.parent && mvn package
cd ../com.evrasoft.jcr.parent/

# Doing the release
	
	echo "Set new version to release version $RELEASE_VERSION"
	mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=$RELEASE_VERSION
	sed -i.bak 's/.qualifier//g' ../$updatesiteDir/category.xml	
	mvn clean verify
	[ -d ../$releaseDir ] || mkdir ../$releaseDir
	mv ../$updatesiteDir/target/$updatesiteDir-$RELEASE_VERSION.zip ../$releaseDir/
	
	if [ ! "$DRY_RUN" ]; then
		git commit -a -m '[release]	Release $RELEASE_VERSION'
		git tag v$RELEASE_VERSION
	fi
	# Setting the development version
	
	echo "Set new version to development version $NEXTDEV_VERSION-SNAPSHOT"
	mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=$NEXTDEV_VERSION-SNAPSHOT
	sed -i.bak "s/$RELEASE_VERSION/$NEXTDEV_VERSION\.qualifier/g" ../$updatesiteDir/category.xml
	
	#mvn clean verify
		
	if [ ! "$DRY_RUN" ]; then
		git commit -a -m "[release] Set version to $NEXTDEV_VERSION-SNAPSHOT"
	fi
	
	# Success message
	
	echo "Release $RELEASE_VERSION  successfully created"
	echo "Current version is now $NEXTDEV_VERSION-SNAPSHOT"

	


if [ "$DRY_RUN" ]; then
	echo "reverting changes"
	git clean -f ../..
	git reset --hard HEAD
else 
	echo "Do not forget to push changes!"
fi








