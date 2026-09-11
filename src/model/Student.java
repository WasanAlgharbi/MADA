package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String universityId;
    private String major;
    private double gpa;

    private List<Course> courses;
    private List<Goal> goals;
    private List<Project> projects;
    private List<Skill> skills;
    private List<Certificate> certificates;
    private List<Achievement> achievements;

    private CareerPlan careerPlan;

    public Student(
            String name,
            String universityId,
            String major,
            double gpa
    ) {
        this.name = name;
        this.universityId = universityId;
        this.major = major;
        this.gpa = gpa;

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

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Goal> getGoals() {
        return goals;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public CareerPlan getCareerPlan() {
        return careerPlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setCareerPlan(CareerPlan careerPlan) {
        this.careerPlan = careerPlan;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public void addCertificate(Certificate certificate) {
        certificates.add(certificate);
    }

    public void addAchievement(Achievement achievement) {
        achievements.add(achievement);
    }

    @Override
    public String toString() {
        return "Student: " + name
                + "\nUniversity ID: " + universityId
                + "\nMajor: " + major
                + "\nGPA: " + String.format("%.2f", gpa);
    }
}