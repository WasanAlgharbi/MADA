package controller;

import model.Course;
import service.CourseService;
import util.InputUtil;
import util.ValidationUtil;

import java.util.List;

public class CourseController {

    private final CourseService service;
    private final InputUtil input;

    public CourseController(
            CourseService service,
            InputUtil input
    ) {
        this.service = service;
        this.input = input;
    }

    public void run() {

        while (true) {

            System.out.println("\n--- Courses ---");

            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Calculate GPA");
            System.out.println("6. Back");

            int choice = input.readInt("Choose: ");

            switch (choice) {

                case 1 ->
                        add();

                case 2 ->
                        view();

                case 3 ->
                        update();

                case 4 ->
                        delete();

                case 5 ->
                        System.out.printf(
                                "Calculated GPA: %.2f%n",
                                service.calculateGpa()
                        );

                case 6 -> {
                    return;
                }

                default ->
                        System.out.println("Invalid choice.");
            }
        }
    }

    private void add() {

        String name =
                input.readString("Course name: ");

        String code =
                input.readString("Course code: ");

        int hours =
                input.readInt("Credit hours: ");

        double grade =
                input.readDouble("Grade: ");

        if (ValidationUtil.isBlank(name)
                || ValidationUtil.isBlank(code)
                || !ValidationUtil.validCreditHours(hours)
                || !ValidationUtil.validGrade(grade)) {

            System.out.println("Invalid course data.");
            return;
        }

        service.addCourse(
                new Course(
                        name,
                        code,
                        hours,
                        grade
                )
        );

        System.out.println("Course added.");
    }

    private void view() {

        List<Course> courses =
                service.calculateGpa() >= 0
                        ? service.getStudent().getCourses()
                        : List.of();

        if (courses.isEmpty()) {

            System.out.println("No courses.");
            return;
        }

        courses.forEach(System.out::println);
    }

    private void update() {

        String code =
                input.readString("Course code: ");

        Course course =
                service.findCourse(code);

        if (course == null) {

            System.out.println("Course not found.");
            return;
        }

        String name =
                input.readString("New name: ");

        int hours =
                input.readInt("New credit hours: ");

        double grade =
                input.readDouble("New grade: ");

        if (service.updateCourse(
                code,
                name,
                hours,
                grade
        )) {

            System.out.println("Course updated.");
        }
    }

    private void delete() {

        String code =
                input.readString("Course code: ");

        System.out.println(
                service.removeCourse(code)
                        ? "Course deleted."
                        : "Course not found."
        );
    }
}