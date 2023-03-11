package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        if (isEmpty(name) || firstCharIsTitle(name)) {
            return false;
        }
        return isStringValid(name);
    }

    public static boolean isStringValid(String name) {
        boolean valid = false;
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (isSpecialSymbol(code)
                    || isUpperLatinLetter(code)
                    || isLowerLatinLetter(code)
                    || isNumeric(name.charAt(i))) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    public static boolean isEmpty(String name) {
        return name.length() == 0;
    }

    public static boolean firstCharIsTitle(String name) {
        return Character.isUpperCase(name.charAt(0)) || isNumeric(name.charAt(0));
    }

    public static boolean isNumeric(char ch) {
        return Character.isDigit(ch);
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }
}
