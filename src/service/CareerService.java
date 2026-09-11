package service;

import model.CareerPlan;
import model.Student;

public class CareerService {

    private final Student student;

    public CareerService(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void createOrUpdatePlan(String goal) {

        if (student.getCareerPlan() == null) {

            student.setCareerPlan(
                    new CareerPlan(goal)
            );

        } else {

            student.getCareerPlan()
                    .setCareerGoal(goal);
        }
    }

    public CareerPlan getCareerPlan() {
        return student.getCareerPlan();
    }

    public boolean addRequiredSkill(String skill) {

        if (student.getCareerPlan() == null) {
            return false;
        }

        student.getCareerPlan()
                .addRequiredSkill(skill);

        return true;
    }

    public boolean addRequiredCertificate(
            String certificate
    ) {

        if (student.getCareerPlan() == null) {
            return false;
        }

        student.getCareerPlan()
                .addRequiredCertificate(certificate);

        return true;
    }

    public boolean addTargetCompany(String company) {

        if (student.getCareerPlan() == null) {
            return false;
        }

        student.getCareerPlan()
                .addTargetCompany(company);

        return true;
    }
}