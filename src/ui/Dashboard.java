package ui;

import engine.ProgressEngine;
import model.Student;

public class Dashboard {

    public void display(Student student) {
        ProgressEngine engine = new ProgressEngine(student);

        System.out.println();
        System.out.println("==================================================");
        System.out.println("                 MADA DASHBOARD");
        System.out.println("          Make A Dream Achievable");
        System.out.println("==================================================");

        System.out.println("\nSTUDENT");
        System.out.println("--------------------------------------------------");
        System.out.println("Name          : " + student.getName());
        System.out.println("University ID : " + student.getUniversityId());
        System.out.println("Major         : " + student.getMajor());
        System.out.printf("GPA           : %.2f%n", student.getGpa());

        System.out.println("\nPROGRESS");
        System.out.println("--------------------------------------------------");
        System.out.println("Courses       : " + student.getCourses().size());
        System.out.println("Goals         : " + student.getGoals().size());
        System.out.println("Completed     : " + engine.getCompletedGoals());
        System.out.println("Projects      : " + student.getProjects().size());
        System.out.println("Skills        : " + student.getSkills().size());
        System.out.println("Certificates  : " + student.getCertificates().size());
        System.out.println("Achievements  : " + student.getAchievements().size());

        System.out.println("\nOVERALL PROGRESS");
        System.out.println("--------------------------------------------------");
        System.out.println(engine.getProgressBar() +
                " " + engine.calculateOverallProgress() + "%");
        System.out.println("Level         : " + engine.getStudentLevel());

        System.out.println("\nCAREER");
        System.out.println("--------------------------------------------------");
        if (student.getCareerPlan() == null) {
            System.out.println("Career Goal   : Not set");
        } else {
            System.out.println("Career Goal   : " +
                    student.getCareerPlan().getCareerGoal());
        }

        System.out.println("==================================================");
    }
}