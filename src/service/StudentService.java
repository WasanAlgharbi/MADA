  private Student student;

    public StudentService(Student student) {
        this.student = student;
    }

    public void addCourse(Course course) {
        student.getCourses().add(course);
    }

    public void addGoal(Goal goal) {
        student.getGoals().add(goal);
    }

    public void addProject(Project project) {
        student.getProjects().add(project);
    }

    public void addSkill(Skill skill) {
        student.getSkills().add(skill);
    }

    public void addCertificate(Certificate certificate) {
        student.getCertificates().add(certificate);
    }

    public void addAchievement(Achievement achievement) {
        student.getAchievements().add(achievement);
    }

    public Student getStudent() {
        return student;
    }
}
