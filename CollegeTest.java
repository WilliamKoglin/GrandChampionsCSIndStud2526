import java.util.List;

public class CollegeTest {
    public static void main(String[] args) {

        List<College> colleges = CollegeLoader.loadColleges("colleges.json");

        if (colleges == null) {
            System.out.println("Load failed.");
            return;
        }

        System.out.println("Loaded " + colleges.size() + " colleges.");

        // Print details of the first college
        College first = colleges.get(0);

        System.out.println("First college: " + first.getName());
        System.out.println("GPA: " + first.getAvgGPA());
        System.out.println("SAT Min: " + first.getSatMin());

        // Find and print acceptance rate for MIT
        for (College c : colleges) {
        if (c.getName().equals("MIT")) {
            System.out.println("MIT Acceptance: " + c.getAcceptanceRate());
        }
    }
}
}