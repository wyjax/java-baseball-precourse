package baseball.generator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnswerNumberGeneratorTest {
    private AnswerNumberGenerator generator = new AnswerNumberGenerator();

    @Test
    public void 세자리_난수_생성_테스트() {
        // given
        int numberLength = 3;

        // when
        String createdNum = generator.createAnswer(3);

        // then
        Assertions.assertThat(createdNum.length()).isEqualTo(numberLength);
    }

    @Test
    public void 서로_다른_세자리수_생성_테스트() {
        // given
        int[] numbers = new int[10];

        // when
        String randomNumber = generator.createAnswer(3);

        for (char c : randomNumber.toCharArray()) {
            ++numbers[c - '0'];
        }

        boolean isOverOne = false;

        for (int number : numbers) {
            if (number > 1) {
                isOverOne = true;
                break;
            }
        }

        // then
        Assertions.assertThat(isOverOne).isFalse();
    }
}
