#!/usr/bin/env python 

import os
import subprocess
import sys
import string

def fileIsNewerThan(file, dependentFile):
	return (not os.path.exists (dependentFile)) or os.path.getmtime(file)>os.path.getmtime(dependentFile)

def createLocalRepositoryIfNotUpToDate ():
	if (fileIsNewerThan ('../../releng/com.github.evra.jcr.repository/category.xml', 
	                    '../../releng/com.github.evra.jcr.repository/target/category.xml') or
	   fileIsNewerThan ('../../releng/com.github.evra.jcr.targetplatform/xtextexample.target', 
					    '../../releng/com.github.evra.jcr.repository/target/category.xml')): 
		print 'Rebuild of repository required'
		subprocess.call ("cd ../../releng/com.github.evra.jcr.repository.parent && mvn package", shell=True)
	else:
		print 'Repository is up to date'

def runMaven():
	s = 'mvn ' + string.join (sys.argv[1:], ' ')
	print "Calling " + '"' + s + '"'
	subprocess.call (s, shell=True)
	
createLocalRepositoryIfNotUpToDate()
runMaven()
