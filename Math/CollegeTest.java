package Math;
import java.util.List;
import CollegeInformation.College;
import CollegeInformation.CollegeLoader;
import StudentInformation.Student;

public class CollegeTest {

    public static void main(String[] args) {

        List<College> colleges = CollegeLoader.loadColleges("colleges.json");

        Student student = new Student(
            1500,   // SAT
            34,     // ACT
            4.1,    // GPA
            true,   // first time applicant
            8       // writing ability
        );

        AdmissionPredictor.evaluateStudent(student, colleges);
    }
}