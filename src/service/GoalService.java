package service;

import model.Goal;
import model.Student;

public class GoalService {

    private final Student student;

    public GoalService(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void addGoal(Goal goal) {
        student.addGoal(goal);
    }

    public boolean removeGoal(String title) {
        return student.getGoals()
                .removeIf(goal ->
                        goal.getTitle().equalsIgnoreCase(title)
                );
    }

    public Goal findGoal(String title) {
        return student.getGoals()
                .stream()
                .filter(goal ->
                        goal.getTitle().equalsIgnoreCase(title)
                )
                .findFirst()
                .orElse(null);
    }

    public boolean setCompleted(
            String title,
            boolean completed
    ) {
        Goal goal = findGoal(title);

        if (goal == null) {
            return false;
        }

        goal.setCompleted(completed);
        return true;
    }
}