package model;

import java.util.ArrayList;

public class Goal {

    private String name;

    private ArrayList<Milestone>
            milestones;

    private ArrayList<String>
            completedDates;

    public Goal(String name) {

        this.name = name;

        milestones =
                new ArrayList<>();

        completedDates =
                new ArrayList<>();
    }

    public void addMilestone(
            String milestoneName
    ) {

        Milestone milestone =
                new Milestone(
                        milestoneName
                );

        milestones.add(milestone);
    }

    public void completeMilestone(
            int index
    ) {

        if (
                index >= 0
                        && index < milestones.size()
        ) {
            milestones
                    .get(index)
                    .complete();
        }
    }

    public void recordProgress(
            String date
    ) {

        if (
                !completedDates
                        .contains(date)
        ) {
            completedDates.add(date);
        }
    }

    public double calculateProgress() {

        if (milestones.isEmpty()) {
            return 0;
        }

        int completed = 0;

        for (
                Milestone milestone
                : milestones
        ) {
            if (
                    milestone.isCompleted()
            ) {
                completed++;
            }
        }

        return (
                completed * 100.0
        ) / milestones.size();
    }

    public boolean isCompleted() {

        return calculateProgress()
                == 100;
    }

    public void displayGoal() {

        System.out.println(
                "\nGoal: "
                        + name
        );

        System.out.println(
                "Progress: "
                        + calculateProgress()
                        + "%"
        );

        System.out.println(
                "\nMilestones:"
        );

        for (
                int i = 0;
                i < milestones.size();
                i++
        ) {
            System.out.println(
                    (i + 1)
                            + ". "
                            + milestones.get(i)
            );
        }

        System.out.println(
                "\nCompleted sessions: "
                        + completedDates.size()
        );
    }

    public String getName() {
        return name;
    }

    public ArrayList<Milestone>
    getMilestones() {

        return milestones;
    }
}
