package baseball.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class BallsTest {
    private Balls answerBalls;

    @BeforeEach
    public void setUp() {
        List<Integer> first = Arrays.asList(1, 2, 3);
        answerBalls = new Balls(first);
    }

    @Test
    public void result_3스트라이크_테스트() {
        Balls inputBalls = new Balls(Arrays.asList(1, 2, 3));
        GameResult result = answerBalls.result(inputBalls);
        Assertions.assertThat(result.getStrike()).isEqualTo(3);
    }

    @Test
    public void result_3볼_테스트() {
        Balls inputBalls = new Balls(Arrays.asList(3, 1, 2));
        GameResult result = answerBalls.result(inputBalls);
        Assertions.assertThat(result.getBall()).isEqualTo(3);
    }
}