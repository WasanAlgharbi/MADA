package util;

import java.time.LocalDate;

public class DateUtil {


    public static String getCurrentDate() {

        return LocalDate.now().toString();

    }


    public static boolean isValidDate(String date) {

        try {

            LocalDate.parse(date);
            return true;

        }

        catch (Exception e) {

            return false;

        }

    }

}
