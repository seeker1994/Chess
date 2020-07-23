#!/usr/bin/env bash
rm -rf ./outPath
mkdir outPath
cd src
javac -d ../outPath ./com/myProjects/Main.java
cd ../outPath/
java com/myProjects/Main