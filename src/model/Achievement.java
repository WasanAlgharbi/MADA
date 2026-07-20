package model;

import java.time.LocalDate;

public class Achievement {

    private String title;
    private String provider;
    private LocalDate date;
    private String certificatePath;

    public Achievement(
            String title,
            String provider,
            LocalDate date,
            String certificatePath
    ) {
        this.title = title;
        this.provider = provider;
        this.date = date;
        this.certificatePath = certificatePath;
    }

    public String getTitle() {
        return title;
    }

    public String getProvider() {
        return provider;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCertificatePath() {
        return certificatePath;
    }

    @Override
    public String toString() {

        return title
                + " | Provider: "
                + provider
                + " | Date: "
                + date;
    }
}
