package app;

import java.util.Scanner;

import model.Student;
import ui.Dashboard;
import ui.Menu;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Student student = new Student("Wasan Algharbi", "221000000");

        boolean running = true;

        while (running) {

            Menu.displayMainMenu();

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    Dashboard.display(student);
                    break;

                case 9:
                    running = false;
                    System.out.println("Thank you for using MADA.");
                    break;

                default:
                    System.out.println("Feature will be added soon.");

            }

        }

        input.close();

    }

}
