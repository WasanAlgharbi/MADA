package model;

import java.util.ArrayList;

public class Student {

    private String name;
    private String major;
    private double gpa;
    private double gpaScale;
    private String careerGoal;

    private ArrayList<Course> courses;
    private ArrayList<Goal> goals;
    private ArrayList<Skill> skills;
    private ArrayList<Achievement> achievements;
    private ArrayList<Certificate> certificates;
    private ArrayList<Project> projects;

    public Student(
            String name,
            String major,
            double gpaScale
    ) {
        this.name = name;
        this.major = major;
        this.gpaScale = gpaScale;

        courses = new ArrayList<>();
        goals = new ArrayList<>();
        skills = new ArrayList<>();
        achievements = new ArrayList<>();
        certificates = new ArrayList<>();
        projects = new ArrayList<>();
    }

    public void setGpa(double gpa) {

        if (gpa < 0 || gpa > gpaScale) {
            throw new IllegalArgumentException(
                    "Invalid GPA"
            );
        }

        this.gpa = gpa;
    }

    public void setCareerGoal(
            String careerGoal
    ) {
        this.careerGoal = careerGoal;
    }

    public void addCourse(
            Course course
    ) {
        courses.add(course);
    }

    public void addGoal(
            Goal goal
    ) {
        goals.add(goal);
    }

    public void addSkill(
            Skill skill
    ) {
        skills.add(skill);
    }

    public void addAchievement(
            Achievement achievement
    ) {
        achievements.add(achievement);
    }

    public void addCertificate(
            Certificate certificate
    ) {
        certificates.add(certificate);
    }

    public void addProject(
            Project project
    ) {
        projects.add(project);
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public double getGpaScale() {
        return gpaScale;
    }

    public String getCareerGoal() {
        return careerGoal;
    }

    public ArrayList<Course>
    getCourses() {
        return courses;
    }

    public ArrayList<Goal>
    getGoals() {
        return goals;
    }

    public ArrayList<Skill>
    getSkills() {
        return skills;
    }

    public ArrayList<Achievement>
    getAchievements() {
        return achievements;
    }

    public ArrayList<Certificate>
    getCertificates() {
        return certificates;
    }

    public ArrayList<Project>
    getProjects() {
        return projects;
    }

    public void displayDashboard() {

        System.out.println(
                "\n========================"
        );

        System.out.println(
                "          MADA"
        );

        System.out.println(
                "  Make A Dream Achievable"
        );

        System.out.println(
                "========================"
        );

        System.out.println(
                "\nStudent: "
                        + name
        );

        System.out.println(
                "Major: "
                        + major
        );

        System.out.println(
                "Career Goal: "
                        + careerGoal
        );

        System.out.println(
                "GPA: "
                        + gpa
                        + " / "
                        + gpaScale
        );

        System.out.println(
                "Courses: "
                        + courses.size()
        );

        System.out.println(
                "Goals: "
                        + goals.size()
        );

        System.out.println(
                "Completed Skills: "
                        + skills.size()
        );

        System.out.println(
                "Achievements: "
                        + achievements.size()
        );

        System.out.println(
                "Certificates: "
                        + certificates.size()
        );

        System.out.println(
                "Projects: "
                        + projects.size()
        );
    }
}
