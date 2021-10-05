package baseball.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void haxText_빈칸_여부_테스트() {
        // given
        String text = "";

        // when
        boolean result = StringUtils.hasText(text);

        // then
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void haxText_NULL_테스트() {
        // given
        String text = null;
        // when
        boolean result = StringUtils.hasText(text);
        // then
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void haxText_성공_테스트() {
        // given
        String text = "엄정기";
        // when
        boolean result = StringUtils.hasText(text);
        // then
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void isNumeric_한글_테스트() {
        // given
        String text = "엄정기";
        // when
        boolean result = StringUtils.isNumeric(text);
        // then
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void isNumeric_숫자_테스트() {
        // given
        String text = "1234";
        // when
        boolean result = StringUtils.isNumeric(text);
        // then
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void isNumeric_null_테스트() {
        // given
        String text = null;
        // when
        boolean result = StringUtils.isNumeric(text);
        // then
        Assertions.assertThat(result).isFalse();
    }
}
