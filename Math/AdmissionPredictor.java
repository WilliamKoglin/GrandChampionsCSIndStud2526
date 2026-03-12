package Math;
import java.util.List;
import CollegeInformation.College;
import StudentInformation.Student;

public class AdmissionPredictor {

    public static double estimateProbability(Student student, College college) {

        double score = 0;

        // GPA comparison
        if (student.getGpa() >= college.getAvgGPA()) {
            score += 0.4;
        }

        // SAT comparison
        if (student.getSatScore() >= college.getSatMax()) {
            score += 0.3;
        } else if (student.getSatScore() >= college.getSatMin()) {
            score += 0.15;
        }

        // ACT comparison
        if (student.getActScore() >= college.getActMax()) {
            score += 0.3;
        } else if (student.getActScore() >= college.getActMin()) {
            score += 0.15;
        }

        // Writing ability
        score += (student.getWritingAbility() / 10.0) * (college.getWritingPoints() / 100.0);

        // First time applicant bonus
        if (student.isFirstTimeApplicant()) {
            score += 0.05;
        }

        // Adjust by acceptance rate
        double acceptanceFactor = college.getAcceptanceRate() / 100.0;

        return Math.min(score * acceptanceFactor * 2, 1.0);
    }

    public static void evaluateStudent(Student student, List<College> colleges) {

        for (College c : colleges) {
            double probability = estimateProbability(student, c);

            System.out.println(
                c.getName() + ": " + String.format("%.2f%%", probability * 100)
            );
        }
    }
}