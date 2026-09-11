package service;

import model.Student;

public class StudentService {

    private Student student;

    public StudentService(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void updateStudent(
            String name,
            String universityId,
            String major,
            double gpa
    ) {
        student.setName(name);
        student.setUniversityId(universityId);
        student.setMajor(major);
        student.setGpa(gpa);
    }
}