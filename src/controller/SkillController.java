package controller;

import model.Skill;
import model.Student;
import util.InputUtil;

public class SkillController {

    private final Student student;
    private final InputUtil input;

    public SkillController(
            Student student,
            InputUtil input
    ) {
        this.student = student;
        this.input = input;
    }

    public void run() {

        while (true) {

            System.out.println("\n--- Skills ---");

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

        String name =
                input.readString("Skill name: ");

        String category =
                input.readString("Category: ");

        student.addSkill(
                new Skill(
                        name,
                        category
                )
        );

        System.out.println("Skill added.");
    }

    private void view() {

        if (student.getSkills().isEmpty()) {

            System.out.println("No skills.");
            return;
        }

        student.getSkills()
                .forEach(System.out::println);
    }

    private void complete() {

        String name =
                input.readString("Skill name: ");

        for (Skill skill : student.getSkills()) {

            if (skill.getName()
                    .equalsIgnoreCase(name)) {

                skill.setCompleted(
                        input.readYesNo(
                                "Mark as completed?"
                        )
                );

                System.out.println(
                        "Skill updated."
                );

                return;
            }
        }

        System.out.println("Skill not found.");
    }

    private void delete() {

        String name =
                input.readString("Skill name: ");

        boolean removed =
                student.getSkills()
                        .removeIf(
                                s -> s.getName()
                                        .equalsIgnoreCase(name)
                        );

        System.out.println(
                removed
                        ? "Skill deleted."
                        : "Skill not found."
        );
    }
}