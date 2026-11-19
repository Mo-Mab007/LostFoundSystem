@echo off
rem Compiles all source and test files into out\
if exist out rmdir /s /q out
mkdir out
dir /s /b src\*.java tests\*.java > sources.txt
javac -d out -cp "lib/*" @sources.txt
if %errorlevel%==0 echo Build OK. Run with: java -cp out Main
del sources.txt
