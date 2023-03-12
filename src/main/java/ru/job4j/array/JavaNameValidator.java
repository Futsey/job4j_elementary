package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        return name.length() != 0
                && !Character.isDigit(0)
                && !Character.isUpperCase(name.charAt(0))
                && isStringValid(name);
    }

    public static boolean isStringValid(String name) {
        boolean valid = false;
        for (int i = 1; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (code == 36 || code == 95
                    || code >= 97 && code <= 122
                    || code >= 65 && code <= 90) {
                valid = true;
                break;
            }
        }
        return valid;
    }
}
