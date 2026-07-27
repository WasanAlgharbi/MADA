package service;

import model.CareerPlan;

public class CareerService {

    public void displayCareer(CareerPlan career) {

        System.out.println("Career Goal: " + career.getCareerGoal());
        System.out.println("Target Company: " + career.getTargetCompany());

    }
}
