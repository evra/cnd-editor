#! python

import os
import subprocess
import sys
import string
import argparse
import subprocess
import json

def echo (s):
	print ("[### Publish ###] " + s)

def call (s):
	echo (s)
	result = subprocess.check_call(s, shell=True)
	if result > 0:
		sys.exit ("Command " + s + "returned " + result)

projectName = "com.evrasoft.jcr"
releaseDir = projectName + ".releases"
updatesiteDir = projectName + ".updatesite"


parser = argparse.ArgumentParser(description='Publish "' + projectName +'" to bintray.com or github.com')
parser.add_argument('releaseVersion', metavar='RV', help='the version number for the release, e.g. 1.0.0')
parser.add_argument('credentials', metavar='credentials', help='ownder crdendials, for bintray APIKey')
parser.add_argument('--bintray', dest='bintray', action='store_true',
                   help='Publsih new version to bintray.com')
parser.add_argument('--github', dest='github', action='store_true',
                   help='Publsih new version to github.com')
args = parser.parse_args()



bintrayUrl="https://api.bintray.com" 
bintrayUser="evra"
bintrayPackage="cnd-editor"
bintracRepo="eclipse"
bintrayVersionUrl= bintrayUrl +"/packages/"+bintrayUser+"/"+bintracRepo+"/"+bintrayPackage+"/versions"
bintrayContentUrl= bintrayUrl +"/content/"+bintrayUser+"/"+bintracRepo+"/"+bintrayPackage+"/"+args.releaseVersion


packageName = updatesiteDir+ "-" + args.releaseVersion + ".zip" 
packagePath="../"+releaseDir + "/" + packageName


if args.bintray:
	echo("publishing " + packagePath + " to " + bintrayUrl)
	call("unzip " + packagePath + " artifacts.jar content.jar -d ../"+releaseDir + "/unpacked" )
	call("cp " + packagePath + " ../"+releaseDir + "/2publish.zip" )
	call("zip -d " + " ../"+releaseDir + "/2publish.zip artifacts.jar content.jar" )

	call("curl -X PUT -u " + bintrayUser +":" +args.credentials + " --data-binary @../"+releaseDir + "/unpacked/artifacts.jar "+  bintrayContentUrl + "/artifacts.jar")
	call("curl -X PUT -u " + bintrayUser +":" +args.credentials + " --data-binary @../"+releaseDir + "/unpacked/content.jar "+  bintrayContentUrl + "/content.jar")
	call("curl -X PUT -u " + bintrayUser +":" +args.credentials + " --data-binary @../"+releaseDir + "/2publish.zip "+  bintrayContentUrl + "/2publish.zip;explode=1")

	call("rm ../"+releaseDir + "/2publish.zip")
	call("rm  -rf ../"+releaseDir + "/unpacked")

	#body={
	#	"name:" : args.releaseVersion,
	#	"release_notes" : "see https://github.com/evra/cnd-editor/releases",
	#	"release_url" : "https://github.com/evra/cnd-editor/releases"
	#	}
	
	#call('curl -X POST -H "Content-Type: application/json" -u ' + bintrayUser +':' +args.credentials 
	#	+ ' -d \'' + json.dumps(body) + '\' ' + bintrayVersionUrl)