package controller;

import model.Goal;
import service.GoalService;
import util.InputUtil;

public class GoalController {

    private final GoalService service;
    private final InputUtil input;

    public GoalController(
            GoalService service,
            InputUtil input
    ) {
        this.service = service;
        this.input = input;
    }

    public void run() {

        while (true) {

            System.out.println("\n--- Goals ---");

            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Complete / Uncomplete");
            System.out.println("4. Delete");
            System.out.println("5. Back");

            int choice =
                    input.readInt("Choose: ");

            switch (choice) {

                case 1 ->
                        add();

                case 2 ->
                        view();

                case 3 ->
                        complete();

                case 4 ->
                        delete();

                case 5 -> {
                    return;
                }

                default ->
                        System.out.println("Invalid choice.");
            }
        }
    }

    private void add() {

        String title =
                input.readString("Title: ");

        String description =
                input.readString("Description: ");

        service.addGoal(
                new Goal(
                        title,
                        description
                )
        );

        System.out.println("Goal added.");
    }

    private void view() {

        if (service.getStudent()
                .getGoals()
                .isEmpty()) {

            System.out.println("No goals.");
            return;
        }

        service.getStudent()
                .getGoals()
                .forEach(System.out::println);
    }

    private void complete() {

        String title =
                input.readString("Goal title: ");

        boolean completed =
                input.readYesNo(
                        "Mark as completed?"
                );

        System.out.println(
                service.setCompleted(
                        title,
                        completed
                )
                        ? "Goal updated."
                        : "Goal not found."
        );
    }

    private void delete() {

        String title =
                input.readString("Goal title: ");

        System.out.println(
                service.removeGoal(title)
                        ? "Goal deleted."
                        : "Goal not found."
        );
    }
}