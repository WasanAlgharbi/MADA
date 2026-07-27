package model;

public class CareerPlan {

    private String careerGoal;
    private String targetCompany;

    public CareerPlan(String careerGoal, String targetCompany) {
        this.careerGoal = careerGoal;
        this.targetCompany = targetCompany;
    }

    public String getCareerGoal() {
        return careerGoal;
    }

    public String getTargetCompany() {
        return targetCompany;
    }
}
