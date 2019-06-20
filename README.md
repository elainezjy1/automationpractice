##This is just an example of automation framework for testing web site. It's for personal interest and usage. 

##Main technoligies used are: Selenium Web Driver, Page Factory,  Maven, BDD(Cucumber/jbehave). 

1. Below is the command line to execute the test.  The default browser is Chrome. In the below command line, it's configured to run on Chrome with "-Dbrowser=Chrome" . If you're going to run the test in Intellij, please configure your maven run with -Dbrowser=Chrome. e.g. 


"C:\Program Files\Java\jdk-11.0.3\bin\java.exe" -Dmaven.multiModuleProjectDirectory=C:\Users\Administrator\IdeaProjects\test\mystorea\mystorecucumber "-Dmaven.home=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.3\plugins\maven\lib\maven3" "-Dclassworlds.conf=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.3\plugins\maven\lib\maven3\bin\m2.conf" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.3\lib\idea_rt.jar=52919:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.3\plugins\maven\lib\maven3\boot\plexus-classworlds-2.5.2.jar" org.codehaus.classworlds.Launcher -Didea.version2019.1.3 test -Dbrowser=Chrome


2. My local chrome version is not upto date. I used chromedriver version 2.4. My local path is : C:\Users\Administrator\chromedriver_win32\chromedriver.exe   If you're going to run it, please make sure the path is updated to your driver path in file HomeSteps.java  setup() method.  It's not configured yet. 



