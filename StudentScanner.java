import java.util.Scanner;

public class StudentScanner {

    static void getInfo(Scanner sc) {
    //Prompts and scanning for user input
    System.out.print("Enter your SAT Score: ");
    int satScore = sc.nextInt();

    System.out.print("Enter your ACT Score: ");
    int actScore = sc.nextInt();

    System.out.print("Enter your GPA: ");
    double gpa = sc.nextDouble();

    System.out.print("Are you a first-time applicant? (true/false): ");
    boolean isFirstTimeApplicant = sc.nextBoolean();
    
    System.out.print("Rate your writing ability 1 through 10: ");
    int writingAbility = sc.nextInt();


    //Sanity test that user input is being stored correctly
    System.out.println("\n--- Verify that your information is correct ---");
    System.out.println("Your SAT Score is " + satScore + ".");
    System.out.println("Your ACT Score is " + actScore + ".");
    System.out.println("Your GPA is " + gpa + ".");
    System.out.println("First-time applicant: " + isFirstTimeApplicant);
    System.out.println("Your writing ability rating is " + writingAbility + ".");
    System.out.println("Is this information correct? (true/false): ");
    boolean isInformationCorrect = sc.nextBoolean();
    if (isInformationCorrect) {
        System.out.println("Thank you for confirming your information.");
    } else {
        System.out.println("Please re-enter your information.");
        getInfo(sc);
    }
    }
    public static void main(String[] args) {
    Student student = new Student(0, 0, 0.0, false, 0);
    Scanner sc = new Scanner(System.in);
    getInfo(sc);
    System.out.println("Your ACT Score is " + student.getActScore());
    }
}
