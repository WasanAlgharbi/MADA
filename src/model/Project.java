package model;

public class Project {

    private String name;
    private String description;
    private String technologies;
    private boolean completed;

    public Project(
            String name,
            String description,
            String technologies
    ) {
        this.name = name;
        this.description = description;
        this.technologies = technologies;
        this.completed = false;
    }

    public void complete() {
        completed = true;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getTechnologies() {
        return technologies;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {

        String status;

        if (completed) {
            status = "Completed";
        } else {
            status = "In Progress";
        }

        return name
                + " | "
                + technologies
                + " | "
                + status;
    }
}
