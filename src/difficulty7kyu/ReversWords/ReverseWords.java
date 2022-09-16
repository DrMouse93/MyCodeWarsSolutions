package difficulty7kyu.ReversWords;

import java.util.Arrays;
import java.util.StringJoiner;

public class ReverseWords {
    public static String reverseWords(final String original) {
        String[] arrOriginal = original.split(" ");
        if (arrOriginal.length == 0) return original;
        StringJoiner joiner = new StringJoiner(" ");

        Arrays.stream(arrOriginal).forEach(s -> joiner.add(new StringBuilder(s).reverse()));

        return joiner.toString();
    }
}
