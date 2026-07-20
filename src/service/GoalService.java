package service;

import model.Goal;

import java.util.ArrayList;

public class GoalService {

    private ArrayList<Goal> goals;

    public GoalService() {
        goals = new ArrayList<>();
    }

    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    public void completeMilestone(
            String goalName,
            int milestoneIndex
    ) {
        for (Goal goal : goals) {

            if (
                    goal.getName()
                            .equalsIgnoreCase(goalName)
            ) {
                goal.completeMilestone(
                        milestoneIndex
                );

                return;
            }
        }

        System.out.println(
                "Goal not found."
        );
    }

    public void recordProgress(
            String goalName,
            String date
    ) {
        for (Goal goal : goals) {

            if (
                    goal.getName()
                            .equalsIgnoreCase(goalName)
            ) {
                goal.recordProgress(date);

                return;
            }
        }

        System.out.println(
                "Goal not found."
        );
    }

    public void displayAllGoals() {

        for (Goal goal : goals) {
            goal.displayGoal();
        }
    }

    public ArrayList<Goal> getGoals() {
        return goals;
    }
}
