package model;

import java.io.Serializable;

public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private String technology;
    private boolean completed;

    public Project(
            String name,
            String description,
            String technology
    ) {
        this.name = name;
        this.description = description;
        this.technology = technology;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getTechnology() {
        return technology;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return name
                + " | Technology: "
                + technology
                + " | Status: "
                + (completed ? "Completed" : "In Progress");
    }
}