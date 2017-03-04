#!/bin/sh
cdir=$(pwd)
cd $cdir/src
javac *.java
java test
rm -rf *.class
