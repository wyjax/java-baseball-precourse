package baseball.model;

import baseball.type.BallStatus;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GameResultTest {

    @Test
    public void strike_테스트() {
        GameResult result = new GameResult();

        result.addResult(BallStatus.STRIKE);
        Assertions.assertThat(result.getStrike()).isEqualTo(1);
    }

    @Test
    public void ball_테스트() {
        GameResult result = new GameResult();

        result.addResult(BallStatus.BALL);
        Assertions.assertThat(result.getBall()).isEqualTo(1);
    }

    @Test
    public void hasStrike_테스트() {
        GameResult result = new GameResult();

        result.addResult(BallStatus.STRIKE);
        Assertions.assertThat(result.hasStrike()).isTrue();
    }

    @Test
    public void hasBall_테스트() {
        GameResult result = new GameResult();

        result.addResult(BallStatus.BALL);
        Assertions.assertThat(result.hasBall()).isTrue();
    }

    @Test
    public void isContinue_true_테스트() {
        GameResult result = new GameResult();

        result.addResult(BallStatus.BALL);
        result.addResult(BallStatus.STRIKE);
        result.addResult(BallStatus.STRIKE);
        Assertions.assertThat(result.isContinue()).isTrue();
    }

    @Test
    public void isContinue_false_테스트() {
        GameResult result = new GameResult();

        result.addResult(BallStatus.STRIKE);
        result.addResult(BallStatus.STRIKE);
        result.addResult(BallStatus.STRIKE);
        Assertions.assertThat(result.isContinue()).isFalse();
    }

    @Test
    public void isNothing_테스트() {
        GameResult result = new GameResult();

        result.addResult(BallStatus.NOTHING);
        result.addResult(BallStatus.NOTHING);
        result.addResult(BallStatus.NOTHING);
        Assertions.assertThat(result.isNothing()).isTrue();
    }
}