package util;

public final class ValidationUtil {
    private ValidationUtil() {}

    public static boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }

    public static boolean validGpa(double gpa) {
        return gpa >= 0 && gpa <= 5;
    }

    public static boolean validGrade(double grade) {
        return grade >= 0 && grade <= 100;
    }

    public static boolean validCreditHours(int hours) {
        return hours > 0 && hours <= 10;
    }
}