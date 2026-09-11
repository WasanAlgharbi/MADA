package controller;

import model.Achievement;
import model.Student;
import util.DateUtil;
import util.InputUtil;

public class AchievementController {

    private final Student student;
    private final InputUtil input;

    public AchievementController(
            Student student,
            InputUtil input
    ) {
        this.student = student;
        this.input = input;
    }

    public void run() {

        while (true) {

            System.out.println("\n--- Achievements ---");

            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Delete");
            System.out.println("4. Back");

            int choice =
                    input.readInt("Choose: ");

            switch (choice) {

                case 1 ->
                        add();

                case 2 ->
                        view();

                case 3 ->
                        delete();

                case 4 -> {
                    return;
                }

                default ->
                        System.out.println(
                                "Invalid choice."
                        );
            }
        }
    }

    private void add() {

        String title =
                input.readString("Title: ");

        String description =
                input.readString(
                        "Description: "
                );

        String date =
                input.readString(
                        "Date ["
                                + DateUtil.today()
                                + "]: "
                );

        if (date.isBlank()) {
            date = DateUtil.today();
        }

        student.addAchievement(
                new Achievement(
                        title,
                        description,
                        date
                )
        );

        System.out.println(
                "Achievement added."
        );
    }

    private void view() {

        if (student.getAchievements()
                .isEmpty()) {

            System.out.println(
                    "No achievements."
            );

            return;
        }

        student.getAchievements()
                .forEach(System.out::println);
    }

    private void delete() {

        String title =
                input.readString("Title: ");

        boolean removed =
                student.getAchievements()
                        .removeIf(
                                a -> a.getTitle()
                                        .equalsIgnoreCase(title)
                        );

        System.out.println(
                removed
                        ? "Achievement deleted."
                        : "Achievement not found."
        );
    }
}