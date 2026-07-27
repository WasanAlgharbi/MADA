package model;

import java.util.ArrayList;

public class Student {

    private String name;
    private String universityId;
    private double gpa;

    private ArrayList<Course> courses;
    private ArrayList<Goal> goals;
    private ArrayList<Project> projects;
    private ArrayList<Skill> skills;
    private ArrayList<Certificate> certificates;
    private ArrayList<Achievement> achievements;

    public Student(String name, String universityId) {

        this.name = name;
        this.universityId = universityId;
        this.gpa = 0.0;

        courses = new ArrayList<>();
        goals = new ArrayList<>();
        projects = new ArrayList<>();
        skills = new ArrayList<>();
        certificates = new ArrayList<>();
        achievements = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getUniversityId() {
        return universityId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Goal> getGoals() {
        return goals;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public ArrayList<Certificate> getCertificates() {
        return certificates;
    }

    public ArrayList<Achievement> getAchievements() {
        return achievements;
    }
}
