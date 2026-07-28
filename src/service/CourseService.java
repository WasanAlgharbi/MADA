package service;

import model.Course;
import java.util.ArrayList;

public class CourseService {

    public double calculateGPA(ArrayList<Course> courses) {

        if (courses.isEmpty())
            return 0.0;

        double totalPoints = 0;
        int totalHours = 0;

        for (Course c : courses) {

            totalPoints += c.getGrade() * c.getCreditHours();
            totalHours += c.getCreditHours();

        }

        return totalPoints / totalHours;

    }

}
