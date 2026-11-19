#!/bin/sh
# Compiles all source and test files into out/
rm -rf out
mkdir -p out
find src tests -name "*.java" > sources.txt
javac -d out -cp "lib/*" @sources.txt && echo "Build OK. Run with: java -cp out Main"
rm -f sources.txt
