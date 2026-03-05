import java.util.Scanner;

import StudentInformation.Student;
import StudentInformation.StudentScanner;

import CollegeInformation.College;
import CollegeInformation.CollegeLoader;

import Math.AdmissionPredictor;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Get student information
        Student student = StudentScanner.getInfo(sc);

        // Step 2: Load college data
        List<College> colleges = CollegeLoader.loadColleges("colleges.json");

        // Step 3: Evaluate colleges for the student
        AdmissionPredictor.evaluateStudent(student, colleges);

        sc.close();
    }
}