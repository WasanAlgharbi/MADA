package model;

import java.io.Serializable;

public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String code;
    private int creditHours;
    private double grade;

    public Course(
            String name,
            String code,
            int creditHours,
            double grade
    ) {
        this.name = name;
        this.code = code;
        this.creditHours = creditHours;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return code
                + " - "
                + name
                + " | Hours: "
                + creditHours
                + " | Grade: "
                + String.format("%.2f", grade);
    }
}