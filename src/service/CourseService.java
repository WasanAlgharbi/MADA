package service;

import model.Course;
import model.Student;

public class CourseService {

    private final Student student;

    public CourseService(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void addCourse(Course course) {
        student.addCourse(course);
    }

    public boolean removeCourse(String code) {
        return student.getCourses()
                .removeIf(course ->
                        course.getCode().equalsIgnoreCase(code)
                );
    }

    public Course findCourse(String code) {
        return student.getCourses()
                .stream()
                .filter(course ->
                        course.getCode().equalsIgnoreCase(code)
                )
                .findFirst()
                .orElse(null);
    }

    public boolean updateCourse(
            String code,
            String name,
            int creditHours,
            double grade
    ) {
        Course course = findCourse(code);

        if (course == null) {
            return false;
        }

        course.setName(name);
        course.setCreditHours(creditHours);
        course.setGrade(grade);

        return true;
    }

    public double calculateGpa() {

        double weightedTotal = 0;
        int totalHours = 0;

        for (Course course : student.getCourses()) {

            weightedTotal +=
                    course.getGrade() * course.getCreditHours();

            totalHours += course.getCreditHours();
        }

        if (totalHours == 0) {
            return 0;
        }

        return weightedTotal / totalHours;
    }
}