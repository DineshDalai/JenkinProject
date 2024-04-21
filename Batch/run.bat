set projectpath=D:\Workspace\eclipse-workspace\Batch
cd %projectpath%
set classpath=%projectpath%\bin;%projectpath%\lib\*
java org.testng.TestNG %projectpath%\testng.xml
pause