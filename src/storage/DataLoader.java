package storage;

import model.Student;

public class DataLoader {

    private FileManager manager;

    public DataLoader() {

        manager = new FileManager();

    }

    public void saveStudent(Student student) {

        manager.saveObject(student, "student.dat");

    }

    public Student loadStudent() {

        return (Student) manager.loadObject("student.dat");

    }

}
