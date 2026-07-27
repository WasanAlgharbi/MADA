package model;

import java.util.ArrayList;

public class Student {

    // Personal Information
    private String fullName;
    private String universityId;
    private String major;
    private double gpa;

    // Academic Information
    private ArrayList<Course> courses;

    // Personal Development
    private ArrayList<Goal> goals;
    private ArrayList<Project> projects;
    private ArrayList<Skill> skills;
    private ArrayList<Certificate> certificates;
    private ArrayList<Achievement> achievements;

    // Career
    private CareerPlan careerPlan;

    public Student(String fullName, String universityId, String major) {

        this.fullName = fullName;
        this.universityId = universityId;
        this.major = major;

        gpa = 0.0;

        courses = new ArrayList<>();
        goals = new ArrayList<>();
        projects = new ArrayList<>();
        skills = new ArrayList<>();
        certificates = new ArrayList<>();
        achievements = new ArrayList<>();

        careerPlan = null;
    }

    // ===========================
    // Getters
    // ===========================

    public String getFullName() {
        return fullName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
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

    public CareerPlan getCareerPlan() {
        return careerPlan;
    }

    // ===========================
    // Setters
    // ===========================

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setCareerPlan(CareerPlan careerPlan) {
        this.careerPlan = careerPlan;
    }

}
