@echo off
if "%1"=="" (
    :usage
    echo Usage:
    echo if you want to compile and run factory: test factory
    echo if you want to do not compile just run: test factory -nocmp
    goto end
) else if "%2"=="" (
    javac -d classes -sourcepath src src\com\omeraytekin\design_patterns\%1\Test.java
    java -cp classes com.omeraytekin.design_patterns.%1.Test
) else if "%2"=="-nocmp" (
    javac -d classes -sourcepath src src\com\omeraytekin\design_patterns\%1\Test.java
    java -cp classes com.omeraytekin.design_patterns.%1.Test
) else (
    echo Wrong parameters!
    goto usage
)
:end