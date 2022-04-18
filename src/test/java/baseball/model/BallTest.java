package baseball.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BallTest {

    @Test
    public void equals_성공_테스트() {
        Ball left = new Ball(1, 1);
        Ball right = new Ball(1, 1);

        Assertions.assertThat(left.equals(right)).isTrue();
    }

    @Test
    public void equals_실패_테스트() {
        Ball left = new Ball(1, 1);
        Ball right = new Ball(1, 2);

        Assertions.assertThat(left.equals(right)).isFalse();
    }
}