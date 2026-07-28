package model;

public class CareerPlan {

    private String careerGoal;
    private String targetCompany;
    private String requiredSkills;

    public CareerPlan(String careerGoal,
                      String targetCompany,
                      String requiredSkills) {

        this.careerGoal = careerGoal;
        this.targetCompany = targetCompany;
        this.requiredSkills = requiredSkills;

    }

    public String getCareerGoal() {
        return careerGoal;
    }

    public String getTargetCompany() {
        return targetCompany;
    }

    public String getRequiredSkills() {
        return requiredSkills;
    }

    @Override
    public String toString() {

        return "Career Goal: " + careerGoal +
                "\nTarget Company: " + targetCompany +
                "\nRequired Skills: " + requiredSkills;

    }

}
