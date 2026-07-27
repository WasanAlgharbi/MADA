package model;

public class Course {

    private String courseCode;
    private String courseName;
    private int creditHours;
    private double grade;

    public Course(String courseCode, String courseName, int creditHours, double grade) {

        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.grade = grade;

    }

    // ===========================
    // Getters
    // ===========================

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public double getGrade() {
        return grade;
    }

    // ===========================
    // Setters
    // ===========================

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {

        return courseCode + " - " +
               courseName + " | " +
               creditHours + " CH | Grade: " +
               grade;

    }

}
