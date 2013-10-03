#!/bin/sh

if [ $# -lt 2 ]; then
	echo "paramters: <bintrayAPIKey> <releaseVersion>"
	exit 1
fi

APIKEY=$1
RELEASE_VERSION=$2

projectName="com.evrasoft.jcr"
releaseDir="$projectName.releases"
updatesiteDir="$projectName.updatesite"

bintrayUrl="https://api.bintray.com" 
bintrayUser="evra"
bintrayPackage="cnd-editor"
bintracRepo="eclipse"
bintrayVersionUrl="$bintrayUrl/packages/$bintrayUser/$bintracRepo/$bintrayPackage/versions"
bintrayContentUrl="$bintrayUrl/content/$bintrayUser/$bintracRepo/$bintrayPackage/$RELEASE_VERSION"

packageName="$updatesiteDir-$RELEASE_VERSION.zip" 
packagePath="../$releaseDir/$packageName"

	echo "publishing $packagePath to $bintrayUrl"
	unzip $packagePath artifacts.jar content.jar -d ../$releaseDir/unpacked
	cp $packagePath  ../$releaseDir/2publish.zip
	zip -d  ../$releaseDir/2publish.zip artifacts.jar content.jar

	curl -X PUT -u $bintrayUser:$APIKEY --data-binary @../$releaseDir/unpacked/artifacts.jar $bintrayContentUrl/artifacts.jar
	curl -X PUT -u $bintrayUser:$APIKEY --data-binary @../$releaseDir/unpacked/content.jar  $bintrayContentUrl/content.jar
	#curl -X PUT -u $bintrayUser:$APIKEY --data-binary @../$releaseDir/2publish.zip $bintrayContentUrl/2publish.zip;explode=1

	rm ../$releaseDir/2publish.zip
	rm  -rf ../$releaseDir/unpacked
