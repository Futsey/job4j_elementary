package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        return ((word[word.length - 1] - 1) == (post[post.length - 1] - 1));
    }
}
