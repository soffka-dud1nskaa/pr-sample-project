@echo off

if exist out rmdir /s /q out
mkdir out

javac -d out -sourcepath src src\Main.java

if errorlevel 1 (
    echo Ошибка компиляции.
    pause
    exit /b 1
)

jar cfm JavaLab2.jar manifest.mf -C out .

echo.
echo Сборка завершена.
echo Для запуска: java -jar JavaLab2.jar

pause