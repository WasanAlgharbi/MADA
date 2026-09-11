package model;

import java.io.Serializable;

public class Skill implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String category;
    private boolean completed;

    public Skill(String name, String category) {
        this.name = name;
        this.category = category;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return name
                + " | Category: "
                + category
                + " | Status: "
                + (completed ? "Completed" : "In Progress");
    }
}