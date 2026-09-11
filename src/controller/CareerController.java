package controller;

import model.CareerPlan;
import service.CareerService;
import util.InputUtil;

public class CareerController {

    private final CareerService service;
    private final InputUtil input;

    public CareerController(
            CareerService service,
            InputUtil input
    ) {
        this.service = service;
        this.input = input;
    }

    public void run() {

        while (true) {

            System.out.println("\n--- Career Plan ---");

            System.out.println("1. Set Career Goal");
            System.out.println("2. Add Required Skill");
            System.out.println("3. Add Required Certificate");
            System.out.println("4. Add Target Company");
            System.out.println("5. View Plan");
            System.out.println("6. Back");

            int choice =
                    input.readInt("Choose: ");

            switch (choice) {

                case 1 ->
                        setGoal();

                case 2 ->
                        addSkill();

                case 3 ->
                        addCertificate();

                case 4 ->
                        addCompany();

                case 5 ->
                        view();

                case 6 -> {
                    return;
                }

                default ->
                        System.out.println(
                                "Invalid choice."
                        );
            }
        }
    }

    private void setGoal() {

        String goal =
                input.readString(
                        "Career goal: "
                );

        service.createOrUpdatePlan(goal);

        System.out.println(
                "Career goal saved."
        );
    }

    private void addSkill() {

        String skill =
                input.readString(
                        "Required skill: "
                );

        System.out.println(
                service.addRequiredSkill(skill)
                        ? "Skill added."
                        : "Set a career goal first."
        );
    }

    private void addCertificate() {

        String certificate =
                input.readString(
                        "Required certificate: "
                );

        System.out.println(
                service.addRequiredCertificate(
                        certificate
                )
                        ? "Certificate added."
                        : "Set a career goal first."
        );
    }

    private void addCompany() {

        String company =
                input.readString(
                        "Target company: "
                );

        System.out.println(
                service.addTargetCompany(company)
                        ? "Company added."
                        : "Set a career goal first."
        );
    }

    private void view() {

        CareerPlan plan =
                service.getCareerPlan();

        if (plan == null) {

            System.out.println(
                    "No career plan."
            );

        } else {

            System.out.println(plan);
        }
    }
}