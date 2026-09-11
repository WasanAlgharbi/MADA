package app;

import controller.ApplicationController;
import model.Student;
import storage.FileStorage;
import util.InputUtil;

import java.util.Scanner;

public class Main {

    private static final String DATA_FILE = "data/mada.ser";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InputUtil input = new InputUtil(scanner);
        FileStorage storage = new FileStorage(DATA_FILE);

        Student student = null;

        if (storage.exists()) {
            try {
                student = storage.load();
            } catch (Exception e) {
                System.out.println("Saved data could not be loaded.");
                System.out.println("A new student profile will be created.");
            }
        }

        if (student == null) {

            System.out.println("==============================================");
            System.out.println("              Welcome to MADA");
            System.out.println("         Make A Dream Achievable");
            System.out.println("==============================================");

            String name = input.readString("Student name: ");
            String universityId = input.readString("University ID: ");
            String major = input.readString("Major: ");

            double gpa = input.readDouble("Current GPA (0-5): ");

            while (gpa < 0 || gpa > 5) {
                System.out.println("GPA must be between 0 and 5.");
                gpa = input.readDouble("Current GPA (0-5): ");
            }

            student = new Student(
                    name,
                    universityId,
                    major,
                    gpa
            );

        } else {

            System.out.println(
                    "Welcome back, " + student.getName() + "!"
            );
        }

        ApplicationController application =
                new ApplicationController(
                        student,
                        input,
                        storage
                );

        application.run();

        scanner.close();
    }
}