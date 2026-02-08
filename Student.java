public class Student {
    private int satScore;
    private int actScore;
    private double gpa;
    private boolean isFirstTimeApplicant;
    private int writingAbility;

    public Student(int satScore, int actScore, double gpa, boolean isFirstTimeApplicant, int writingAbility) {
        this.satScore = satScore;
        this.actScore = actScore;
        this.gpa = gpa;
        this.isFirstTimeApplicant = isFirstTimeApplicant;
        this.writingAbility = writingAbility;
    }

    // Getters and setters for each field
    public int getSatScore() {
        return satScore;
    }

    public void setSatScore(int satScore) {
        this.satScore = satScore;
    }

    public int getActScore() {
        return actScore;
    }

    public void setActScore(int actScore) {
        this.actScore = actScore;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean isFirstTimeApplicant() {
        return isFirstTimeApplicant;
    }

    public void setFirstTimeApplicant(boolean firstTimeApplicant) {
        isFirstTimeApplicant = firstTimeApplicant;
    }

    public int getWritingAbility() {
        return writingAbility;
    }

    public void setWritingAbility(int writingAbility) {
        this.writingAbility = writingAbility;
    }
}
