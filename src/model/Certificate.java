package model;

import java.time.LocalDate;

public class Certificate {

    private String courseName;
    private String provider;
    private LocalDate completionDate;
    private String certificatePath;

    public Certificate(
            String courseName,
            String provider,
            LocalDate completionDate,
            String certificatePath
    ) {
        this.courseName = courseName;
        this.provider = provider;
        this.completionDate = completionDate;
        this.certificatePath = certificatePath;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getProvider() {
        return provider;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public String getCertificatePath() {
        return certificatePath;
    }

    @Override
    public String toString() {

        return courseName
                + " | Provider: "
                + provider
                + " | Completed: "
                + completionDate;
    }
}
