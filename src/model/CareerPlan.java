package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CareerPlan implements Serializable {

    private static final long serialVersionUID = 1L;

    private String careerGoal;
    private List<String> requiredSkills;
    private List<String> requiredCertificates;
    private List<String> targetCompanies;

    public CareerPlan(String careerGoal) {
        this.careerGoal = careerGoal;
        this.requiredSkills = new ArrayList<>();
        this.requiredCertificates = new ArrayList<>();
        this.targetCompanies = new ArrayList<>();
    }

    public String getCareerGoal() {
        return careerGoal;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    public List<String> getRequiredCertificates() {
        return requiredCertificates;
    }

    public List<String> getTargetCompanies() {
        return targetCompanies;
    }

    public void setCareerGoal(String careerGoal) {
        this.careerGoal = careerGoal;
    }

    public void addRequiredSkill(String skill) {
        requiredSkills.add(skill);
    }

    public void addRequiredCertificate(String certificate) {
        requiredCertificates.add(certificate);
    }

    public void addTargetCompany(String company) {
        targetCompanies.add(company);
    }

    @Override
    public String toString() {
        return "Career Goal: " + careerGoal
                + "\nRequired Skills: " + requiredSkills
                + "\nRequired Certificates: " + requiredCertificates
                + "\nTarget Companies: " + targetCompanies;
    }
}