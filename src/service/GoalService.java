package service;

import model.Goal;

public class GoalService {

    public void markCompleted(Goal goal) {
        goal.completeGoal();
    }

}
