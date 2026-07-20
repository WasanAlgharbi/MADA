package service;

import model.Course;

import java.util.ArrayList;

public class CourseService {

    private ArrayList<Course> courses;

    public CourseService() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void updateCourseGrade(
            String courseName,
            String componentName,
            double grade
    ) {
        for (Course course : courses) {

            if (
                    course.getName()
                            .equalsIgnoreCase(courseName)
            ) {
                course.updateGrade(
                        componentName,
                        grade
                );

                return;
            }
        }

        System.out.println(
                "Course not found."
        );
    }

    public void displayAllCourses() {

        for (Course course : courses) {
            course.displayGrades();
        }
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
