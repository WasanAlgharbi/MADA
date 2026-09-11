package model;

import java.io.Serializable;

public class Achievement implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title;
    private String description;
    private String date;

    public Achievement(
            String title,
            String description,
            String date
    ) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return title
                + " | "
                + description
                + " | Date: "
                + date;
    }
}