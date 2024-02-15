package ru.liga.ppr.exam.task_2_emailchecker;

import static java.util.regex.Pattern.compile;

public class Task2 {

    public static boolean checkEmail(String address) {
        if (address == null || address.isBlank()) {
            return false;
        }
        var regex = "^[a-zA-Z0-9]{1,15}@(teta|tetaent|tetacomp)\\.(ru|org|com)$";
        var pattern = compile(regex);
        var matcher = pattern.matcher(address);
        return matcher.matches();
    }

}
