package controller;

import model.Certificate;
import model.Student;
import util.InputUtil;

public class CertificateController {

    private final Student student;
    private final InputUtil input;

    public CertificateController(
            Student student,
            InputUtil input
    ) {
        this.student = student;
        this.input = input;
    }

    public void run() {

        while (true) {

            System.out.println("\n--- Certificates ---");

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
                        System.out.println("Invalid choice.");
            }
        }
    }

    private void add() {

        String name =
                input.readString(
                        "Certificate name: "
                );

        String issuer =
                input.readString("Issuer: ");

        String date =
                input.readString("Date: ");

        student.addCertificate(
                new Certificate(
                        name,
                        issuer,
                        date
                )
        );

        System.out.println(
                "Certificate added."
        );
    }

    private void view() {

        if (student.getCertificates()
                .isEmpty()) {

            System.out.println(
                    "No certificates."
            );

            return;
        }

        student.getCertificates()
                .forEach(System.out::println);
    }

    private void delete() {

        String name =
                input.readString(
                        "Certificate name: "
                );

        boolean removed =
                student.getCertificates()
                        .removeIf(
                                c -> c.getName()
                                        .equalsIgnoreCase(name)
                        );

        System.out.println(
                removed
                        ? "Certificate deleted."
                        : "Certificate not found."
        );
    }
}