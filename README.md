# GrandChampionsCSIndStud2526

# 2/5/2026 Tutorial Scanner Implicated
To use the scanner, route your terminal into the project folder, then run the following command: 
javac Tutorial.java
java Tutorial

Afterwards, the prompt should come up, you input your age, and the output should follow.

to check if your terminal is in the right folder, run the following command:
ls

It should output
Main.class      Main.java       README.md

If not, you are in the wrong folder. Search up a tutorial on how to route into the folder or ask ChatGPT.

# 2/7/2026 Input of student data implemented
Student class has been made. Inside contains the attributes and basic methods that we will use when it comes to student information.

Student Scanner has been made. Inside contains a loop with a working scanner that will run through a loop of inputs to get user information confirmed.
If information is verified to be incorrect, the loop will run again.
To use the Student Scanner, run the following command (again in the project folder)

javac StudentScanner.java
java StudentScanner

# 2/20/2026 Holy heck this is gonna be a mess
College Data has been imported into a json file. There is a java file named CollegeLoader which loads the data form the json file into readable java objects called colleges (see College.java). Theres minor errors in some of the files and this stuff has to be organized but this will be handled later.

Instructions for running:
Make sure you have gson-2.10.jar downloaded
Run the following two commands:
javac -cp gson-2.10.1.jar *.java   
java -cp .:gson-2.10.1.jar CollegeTest.Java

The output should be
Loaded 20 colleges.
First college: UCSC
GPA: 3.93
SAT Min: 1200
MIT Acceptance: 5

Good work fellas