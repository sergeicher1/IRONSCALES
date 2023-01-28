package ironscales_Selenium_POM.JAVA;

import io.qameta.allure.Description;

public class Removal {
    @Description("Remove whitespaces from start and the end only")
    public static String Remove(String string) {

        // Define start and end indices of the string
        int start = 0, end = string.length() - 1;

        // While char at the beginning is equal to whitespace, increase counter
        while (start < string.length() && string.charAt(start) == ' ') {
            start++;
        }

        // While char at the end is equal to whitespace, decrease counter
        while (end >= 0 && string.charAt(end) == ' ') {
            end--;
        }
        // condition to stop the execution of loops
        if (start > end) {
            return "";
        }
        return string.substring(start, end + 1);
    }
}
