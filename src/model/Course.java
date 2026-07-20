package model;

import java.util.ArrayList;

public class Course {

    private String name;
    private int creditHours;

    private ArrayList<GradeComponent>
            gradeComponents;

    public Course(
            String name,
            int creditHours
    ) {
        this.name = name;
        this.creditHours = creditHours;

        gradeComponents =
                new ArrayList<>();
    }

    public void addGradeComponent(
            String name,
            double maxGrade
    ) {
        GradeComponent component =
                new GradeComponent(
                        name,
                        maxGrade
                );

        gradeComponents.add(component);
    }

    public void updateGrade(
            String componentName,
            double grade
    ) {
        for (
                GradeComponent component
                : gradeComponents
        ) {
            if (
                    component
                            .getName()
                            .equalsIgnoreCase(
                                    componentName
                            )
            ) {
                component.updateGrade(
                        grade
                );

                return;
            }
        }

        System.out.println(
                "Grade component not found."
        );
    }

    public double calculateTotalGrade() {

        double total = 0;

        for (
                GradeComponent component
                : gradeComponents
        ) {
            total +=
                    component
                            .getStudentGrade();
        }

        return total;
    }

    public double calculateTotalMaxGrade() {

        double total = 0;

        for (
                GradeComponent component
                : gradeComponents
        ) {
            total +=
                    component
                            .getMaxGrade();
        }

        return total;
    }

    public void displayGrades() {

        System.out.println(
                "\nCourse: "
                        + name
        );

        for (
                GradeComponent component
                : gradeComponents
        ) {
            System.out.println(
                    component
            );
        }

        System.out.println(
                "Total: "
                        + calculateTotalGrade()
                        + " / "
                        + calculateTotalMaxGrade()
        );
    }

    public String getName() {
        return name;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public ArrayList<GradeComponent>
    getGradeComponents() {

        return gradeComponents;
    }
}
