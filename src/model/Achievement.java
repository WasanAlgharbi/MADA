package model;

public class Achievement {

    private String title;
    private String description;
    private String date;

    public Achievement(String title, String description, String date) {

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

    @Override
    public String toString() {

        return "Achievement: " + title +
                "\nDescription: " + description +
                "\nDate: " + date;

    }

}
