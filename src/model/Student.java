package model;

public class Student {

    private String name;
    private String major;
    private double gpa;
    private double gpaScale;
    private String careerGoal;

    public Student(
            String name,
            String major,
            double gpaScale
    ) {
        this.name = name;
        this.major = major;
        this.gpaScale = gpaScale;
    }

    public void setGpa(double gpa) {

        if (gpa < 0 || gpa > gpaScale) {
            throw new IllegalArgumentException(
                    "Invalid GPA"
            );
        }

        this.gpa = gpa;
    }

    public void setCareerGoal(
            String careerGoal
    ) {
        this.careerGoal = careerGoal;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public double getGpaScale() {
        return gpaScale;
    }

    public String getCareerGoal() {
        return careerGoal;
    }
}
