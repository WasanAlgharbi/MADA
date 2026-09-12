package storage;

import model.Student;

import java.io.*;

public class FileStorage {
    private final File file;

    public FileStorage(String path) {
        this.file = new File(path);
    }

    public void save(Student student) throws IOException {
        File parent = file.getParentFile();
        if (parent != null && !parent.exists()) {
            parent.mkdirs();
        }

        try (ObjectOutputStream output =
                     new ObjectOutputStream(new FileOutputStream(file))) {
            output.writeObject(student);
        }
    }

    public Student load() throws IOException, ClassNotFoundException {
        if (!file.exists()) return null;

        try (ObjectInputStream input =
                     new ObjectInputStream(new FileInputStream(file))) {
            return (Student) input.readObject();
        }
    }

    public boolean exists() {
        return file.exists();
    }
}