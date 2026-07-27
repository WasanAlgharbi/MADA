package ui;

import model.Student;

public class Dashboard {

    public static void display(Student student) {

        System.out.println("\n========== Dashboard ==========");

        System.out.println("Student: " + student.getName());
        System.out.println("University ID: " + student.getUniversityId());
        System.out.println("GPA: " + student.getGpa());

        System.out.println("------------------------------");

        System.out.println("Courses: " + student.getCourses().size());
        System.out.println("Goals: " + student.getGoals().size());
        System.out.println("Projects: " + student.getProjects().size());
        System.out.println("Skills: " + student.getSkills().size());
        System.out.println("Certificates: " + student.getCertificates().size());
        System.out.println("Achievements: " + student.getAchievements().size());

    }

}
