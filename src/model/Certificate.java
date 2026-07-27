package model;

public class Certificate {

    private String title;
    private String organization;

    public Certificate(String title, String organization) {
        this.title = title;
        this.organization = organization;
    }

    public String getTitle() {
        return title;
    }

    public String getOrganization() {
        return organization;
    }
}
