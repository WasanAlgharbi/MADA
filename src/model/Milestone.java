package model;

public class Milestone {

    private String name;
    private boolean completed;

    public Milestone(String name) {
        this.name = name;
        this.completed = false;
    }

    public void complete() {
        completed = true;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {

        String status;

        if (completed) {
            status = "✓";
        } else {
            status = "☐";
        }

        return status + " " + name;
    }
}
