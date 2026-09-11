package service;

import model.Project;
import model.Student;

public class ProjectService {

    private final Student student;

    public ProjectService(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void addProject(Project project) {
        student.addProject(project);
    }

    public boolean removeProject(String name) {
        return student.getProjects()
                .removeIf(project ->
                        project.getName().equalsIgnoreCase(name)
                );
    }

    public Project findProject(String name) {
        return student.getProjects()
                .stream()
                .filter(project ->
                        project.getName().equalsIgnoreCase(name)
                )
                .findFirst()
                .orElse(null);
    }

    public boolean setCompleted(
            String name,
            boolean completed
    ) {
        Project project = findProject(name);

        if (project == null) {
            return false;
        }

        project.setCompleted(completed);
        return true;
    }
}