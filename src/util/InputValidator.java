package util;

public class InputValidator {

    public static boolean isEmpty(String value) {

        return value == null || value.trim().isEmpty();

    }


    public static boolean isValidGPA(double gpa) {

        return gpa >= 0.0 && gpa <= 5.0;

    }


    public static boolean isValidGrade(double grade) {

        return grade >= 0 && grade <= 100;

    }

}
