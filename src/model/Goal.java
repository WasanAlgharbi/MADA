package model;

public class Goal {

    private String title;
    private String description;
    private String targetDate;
    private boolean completed;

    public Goal(String title, String description, String targetDate) {

        this.title = title;
        this.description = description;
        this.targetDate = targetDate;
        this.completed = false;

    }

    // ===========================
    // Getters
    // ===========================

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getTargetDate() {
        return targetDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    // ===========================
    // Setters
    // ===========================

    public void completeGoal() {
        completed = true;
    }

    @Override
    public String toString() {

        String status = completed ? "Completed" : "In Progress";

        return title +
               "\nDescription: " + description +
               "\nTarget Date: " + targetDate +
               "\nStatus: " + status;

    }

}
