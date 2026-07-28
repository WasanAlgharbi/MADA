package model;

public class Project {

    private String title;
    private String description;
    private String technology;
    private String status;

    public Project(String title, String description, String technology, String status) {

        this.title = title;
        this.description = description;
        this.technology = technology;
        this.status = status;

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

    public String getTechnology() {
        return technology;
    }

    public String getStatus() {
        return status;
    }

    // ===========================
    // Setters
    // ===========================

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {

        return title +
               "\nTechnology: " + technology +
               "\nStatus: " + status +
               "\nDescription: " + description;

    }
}
