package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class StudySession {

    private LocalDate date;
    private LocalTime startTime;
    private int durationMinutes;
    private boolean completed;

    public StudySession(
            LocalDate date,
            LocalTime startTime,
            int durationMinutes
    ) {
        this.date = date;
        this.startTime = startTime;
        this.durationMinutes = durationMinutes;
        this.completed = false;
    }

    public void complete() {
        completed = true;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public int getDurationMinutes() {
        return durationMinutes;
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
            status = "Not completed";
        }

        return "Date: " + date
                + " | Time: " + startTime
                + " | Duration: "
                + durationMinutes
                + " minutes"
                + " | Status: "
                + status;
    }
}
