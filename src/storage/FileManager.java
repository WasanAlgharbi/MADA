package storage;

import java.io.*;

public class FileManager {

    public void saveObject(Object object, String fileName) {

        try {

            ObjectOutputStream output =
                    new ObjectOutputStream(new FileOutputStream(fileName));

            output.writeObject(object);

            output.close();

        }

        catch (IOException e) {

            System.out.println("Error while saving data.");

        }

    }

    public Object loadObject(String fileName) {

        try {

            ObjectInputStream input =
                    new ObjectInputStream(new FileInputStream(fileName));

            Object object = input.readObject();

            input.close();

            return object;

        }

        catch (Exception e) {

            return null;

        }

    }

}
