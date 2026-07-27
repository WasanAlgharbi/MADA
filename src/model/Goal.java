package model;

public class Goal {

    private String title;
    private boolean completed;

    public Goal(String title) {
        this.title = title;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void completeGoal() {
        completed = true;
    }
} 
