package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            int postRight = post.length - i - 1;
            int wordRight = word.length - i - 1;
            if (post[postRight] != word[wordRight]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
