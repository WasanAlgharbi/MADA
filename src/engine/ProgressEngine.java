package engine;

import model.Student;

public class ProgressEngine {

    private final Student student;

    public ProgressEngine(Student student) {
        this.student = student;
    }

    public double calculateGoalProgress() {

        if (student.getGoals().isEmpty()) {
            return 0;
        }

        long completed = student.getGoals()
                .stream()
                .filter(goal -> goal.isCompleted())
                .count();

        return (completed * 100.0)
                / student.getGoals().size();
    }

    public double calculateProjectProgress() {

        if (student.getProjects().isEmpty()) {
            return 0;
        }

        long completed = student.getProjects()
                .stream()
                .filter(project -> project.isCompleted())
                .count();

        return (completed * 100.0)
                / student.getProjects().size();
    }

    public double calculateSkillProgress() {

        if (student.getSkills().isEmpty()) {
            return 0;
        }

        long completed = student.getSkills()
                .stream()
                .filter(skill -> skill.isCompleted())
                .count();

        return (completed * 100.0)
                / student.getSkills().size();
    }

    public double calculateOverallProgress() {

        double goalProgress = calculateGoalProgress();
        double projectProgress = calculateProjectProgress();
        double skillProgress = calculateSkillProgress();

        return (goalProgress
                + projectProgress
                + skillProgress) / 3;
    }
}