package controller;

import model.Project;
import service.ProjectService;
import util.InputUtil;

public class ProjectController {

    private final ProjectService service;
    private final InputUtil input;

    public ProjectController(
            ProjectService service,
            InputUtil input
    ) {
        this.service = service;
        this.input = input;
    }

    public void run() {

        while (true) {

            System.out.println("\n--- Projects ---");

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
                input.readString("Project name: ");

        String description =
                input.readString("Description: ");

        String technology =
                input.readString("Technology: ");

        service.addProject(
                new Project(
                        name,
                        description,
                        technology
                )
        );

        System.out.println("Project added.");
    }

    private void view() {

        if (service.getStudent()
                .getProjects()
                .isEmpty()) {

            System.out.println("No projects.");
            return;
        }

        service.getStudent()
                .getProjects()
                .forEach(System.out::println);
    }

    private void complete() {

        String name =
                input.readString("Project name: ");

        boolean completed =
                input.readYesNo(
                        "Mark as completed?"
                );

        System.out.println(
                service.setCompleted(
                        name,
                        completed
                )
                        ? "Project updated."
                        : "Project not found."
        );
    }

    private void delete() {

        String name =
                input.readString("Project name: ");

        System.out.println(
                service.removeProject(name)
                        ? "Project deleted."
                        : "Project not found."
        );
    }
}