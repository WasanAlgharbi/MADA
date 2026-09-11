package controller;

import model.Student;
import service.*;
import storage.FileStorage;
import ui.Dashboard;
import util.InputUtil;

public class ApplicationController {

    private Student student;

    private final InputUtil input;
    private final FileStorage storage;

    private CourseService courseService;
    private GoalService goalService;
    private ProjectService projectService;
    private CareerService careerService;

    public ApplicationController(
            Student student,
            InputUtil input,
            FileStorage storage
    ) {
        this.student = student;
        this.input = input;
        this.storage = storage;
        rebuildServices();
    }

    private void rebuildServices() {
        courseService = new CourseService(student);
        goalService = new GoalService(student);
        projectService = new ProjectService(student);
        careerService = new CareerService(student);
    }

    public void run() {

        while (true) {

            System.out.println("\n================================================");
            System.out.println("                    MADA");
            System.out.println("          Make A Dream Achievable");
            System.out.println("================================================");

            System.out.println("1. Dashboard");
            System.out.println("2. Courses");
            System.out.println("3. Goals");
            System.out.println("4. Projects");
            System.out.println("5. Skills");
            System.out.println("6. Certificates");
            System.out.println("7. Achievements");
            System.out.println("8. Career Plan");
            System.out.println("9. Save");
            System.out.println("10. Exit");

            int choice = input.readInt("Choose: ");

            switch (choice) {

                case 1 ->
                        new Dashboard().display(student);

                case 2 ->
                        new CourseController(
                                courseService,
                                input
                        ).run();

                case 3 ->
                        new GoalController(
                                goalService,
                                input
                        ).run();

                case 4 ->
                        new ProjectController(
                                projectService,
                                input
                        ).run();

                case 5 ->
                        new SkillController(
                                student,
                                input
                        ).run();

                case 6 ->
                        new CertificateController(
                                student,
                                input
                        ).run();

                case 7 ->
                        new AchievementController(
                                student,
                                input
                        ).run();

                case 8 ->
                        new CareerController(
                                careerService,
                                input
                        ).run();

                case 9 ->
                        save();

                case 10 -> {
                    save();
                    System.out.println(
                            "Goodbye. Keep moving toward your dream."
                    );
                    return;
                }

                default ->
                        System.out.println("Invalid choice.");
            }
        }
    }

    private void save() {

        try {

            storage.save(student);

            System.out.println("Data saved successfully.");

        } catch (Exception e) {

            System.out.println(
                    "Could not save data: "
                            + e.getMessage()
            );
        }
    }
}