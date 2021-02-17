# userTest
### Test scenario ###

As a new user, I would like to register my account
As a user I would like to log in my account with my e-mail and password.
Possible Test cases:
1.	Check system behavior when valid email id and password is entered. 
2.	Check system behavior when invalid email id and valid password is entered. 
3.	Check system behavior when valid email id and invalid password is entered. 
4.	Check system behavior when invalid email id and invalid password is entered. 
5.	Check system behavior when email id and password are left blank and Sign in entered. 
6.	Check Forgot your password is working as expected
7.	Check system behavior when "Keep me signed" is checked

### Technologies ###
Project is created with:

Java 8 or Java 11

TestNG 7.0.0

Allure 2.13.0

### How do I get set up? ###

* Get Eclipse HERE or use any other IDE
* The IDE should be setup for JAVA
* Clone the repo listed above
* Open the Repo files in the IDE
* Right Click the top level folder
* Go to Build Path > Configure Build Path
* Select all files in this folder and Click "Open"
* In the box that opens remove all EXCEPT "JRE System Library"
* Click "Add External JARs"
* In the pop-up navigate to the current project's files and find the folder "Cucumber Jars"
* You should now be ready to execute all tests

### How to run tests ###
* Find and select (single click) the 'runner' file you want to run
* Click the Run button, select 'Run As', and run as TestNG
