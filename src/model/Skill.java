package model;

public class Skill {

    private String skillName;
    private String category;
    private String level;

    public Skill(String skillName, String category, String level) {

        this.skillName = skillName;
        this.category = category;
        this.level = level;

    }

    // ===========================
    // Getters
    // ===========================

    public String getSkillName() {
        return skillName;
    }

    public String getCategory() {
        return category;
    }

    public String getLevel() {
        return level;
    }

    // ===========================
    // Setters
    // ===========================

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {

        return skillName +
               "\nCategory: " + category +
               "\nLevel: " + level;

    }

}
