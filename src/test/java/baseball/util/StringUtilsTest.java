package baseball.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StringUtilsTest {

    @Test
    public void parseIntegerListFromString_테스트() {
        String input = "123";
        List<Integer> numbers = StringUtils.parseIntegerListFromString(input);

        Assertions.assertThat(numbers).contains(1, 2, 3);
    }
}