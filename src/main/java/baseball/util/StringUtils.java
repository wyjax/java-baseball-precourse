package baseball.util;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StringUtils {

    private StringUtils() {
    }

    public static List<Integer> parseIntegerListFromString(String string) {
        validateNumber(string);
        Set<Integer> integers = new LinkedHashSet<>();
        for (int i = 0; i < string.length(); i++) {
            Integer integer = Integer.valueOf(string.charAt(i) - '0');
            integers.add(integer);
        }
        return new ArrayList<>(integers);
    }

    public static void validateNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }
}
