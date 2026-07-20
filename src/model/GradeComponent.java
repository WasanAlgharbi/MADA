package model;

public class GradeComponent {

    private String name;
    private double maxGrade;
    private double studentGrade;

    public GradeComponent(
            String name,
            double maxGrade
    ) {
        this.name = name;
        this.maxGrade = maxGrade;
        this.studentGrade = 0;
    }

    public void updateGrade(
            double studentGrade
    ) {

        if (
                studentGrade < 0
                        || studentGrade > maxGrade
        ) {
            throw new IllegalArgumentException(
                    "The grade must be between 0 and "
                            + maxGrade
            );
        }

        this.studentGrade = studentGrade;
    }

    public String getName() {
        return name;
    }

    public double getMaxGrade() {
        return maxGrade;
    }

    public double getStudentGrade() {
        return studentGrade;
    }

    @Override
    public String toString() {

        return name
                + ": "
                + studentGrade
                + " / "
                + maxGrade;
    }
}
