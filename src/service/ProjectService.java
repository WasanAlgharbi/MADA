package service;

import model.Project;

public class ProjectService {

    public void displayProject(Project project) {

        System.out.println("Project: " + project.getTitle());
        System.out.println(project.getDescription());

    }
}
