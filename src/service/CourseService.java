package service;

import model.Course;

public class CourseService {

    public void updateGrade(Course course, String grade) {
        course.setGrade(grade);
    }
}
