package baseball.util;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

    private StringUtils() {
    }

    public static List<Integer> parseIntegerListFromString(String string) {
        validateNumber(string);
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            Integer integer = Integer.valueOf(string.charAt(i) - '0');
            integers.add(integer);
        }
        return integers;
    }

    private static void validateNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }
}
