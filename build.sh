#!/bin/bash

rm -rf out
mkdir out

javac -d out -sourcepath src src/Main.java

jar cfm JavaLab2.jar manifest.mf -C out .

echo "Сборка завершена."
echo "Для запуска: java -jar JavaLab2.jar"