# GrandChampionsCSIndStud2526
### See Instructions.md for instructions about how to use/test the application. What you see below is a log of additions made to this project###


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

!!!NOT WINDOWS COMPATIBLE YET!!!

# 2/25/2026 Folder structure establishment and Instructions.md addition
To follow the coding principle of Encapsulation, we will have the least amount of code visible to main. To do this, we will have different modular folders built into the project so that the codepsace stays clean and productive. This will be divided into three main groups:

CollegeInformation
StudentInformation
Math

These will all export their main purposes into main, which will compile and run our project. As for the tutorial folder, that was a playtesting folder with playtesting files, but we will keep it to show parts of our learning process.

Another thing to recognize is that this file, README.md, is less of an instructions file than it is a log of our development process. To correct this, we will keep logging progress in here, and have instructions labeled in an Instructions.md file. Looking towards the future we may consider moving the instructions into here and creating a seperate log.md file of sorts. Hopefully the codespace is a lot cleaner and we will finish strong.

# 3/4/2026 We're done
Math folder is complete and Main contains all of the nessecary files. At this point we need to make it Windows-friendly, tidy up the outputs, and finally get this repo shared.
Shoutout to the MVP of the day packages. Over half of the errors in the development of this project was due to shaky handling of packages in between folders. Its a drawback of having such modular coding but at least everything works out in the end.
Our final two commands for mac:
javac -cp ".:gson-2.10.1.jar" */*.java Main.java
java -cp ".:gson-2.10.1.jar" Main