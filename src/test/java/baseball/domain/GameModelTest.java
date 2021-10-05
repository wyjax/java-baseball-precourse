package baseball.domain;

import baseball.generator.AnswerNumberGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameModelTest {
    private final AnswerNumberGenerator generator = new AnswerNumberGenerator();

    @Test
    public void 정답확인_테스트() {
        int answerLen = 3;
        String answer = generator.createAnswer(answerLen);
        GameModel model = new GameModel(answer);

        model.match(answer);

        int strikeCount = model.getStrike();

        Assertions.assertThat(strikeCount).isEqualTo(answerLen);
    }

    @Test
    public void 낫싱_테스트() {
        String input = "123";

        GameModel model = new GameModel("456");
        model.match(input);

        System.out.println(model.getBall() + " " + model.getStrike());

        Assertions.assertThat(model.getBall()).isZero();
    }

    @Test
    public void 쓰리볼_테스트() {
        String input = "123";

        GameModel model = new GameModel("312");
        model.match(input);

        System.out.println(model.getBall() + " " + model.getStrike());

        Assertions.assertThat(model.getBall()).isEqualTo(input.length());
    }

    @Test
    public void 투볼_원스트라이크_테스트() {
        String input = "123";

        GameModel model = new GameModel("213");
        model.match(input);

        Assertions.assertThat(model.getBall()).isEqualTo(2);
    }
}
