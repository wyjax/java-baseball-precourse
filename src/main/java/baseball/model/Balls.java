package baseball.model;

import baseball.type.BallStatus;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private List<Ball> balls = new ArrayList<>();
    private List<Integer> numbers;

    public Balls(List<Integer> numbers) {
        this.numbers = numbers;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            Ball ball = new Ball(i, number);
            this.balls.add(ball);
        }
    }

    public GameResult result(Balls inputBalls) {
        GameResult result = new GameResult();
        for (int i = 0; i < inputBalls.balls.size(); i++) {
            Ball inputBall = inputBalls.balls.get(i);
            BallStatus ballStatus = match(inputBall);
            result.addResult(ballStatus);
        }
        return result;
    }

    private BallStatus match(Ball input) {
        int strike = strikeCount(input);
        int ball = ballCount(input);
        if (strike > 0) {
            return BallStatus.STRIKE;
        } else if (ball > 0) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private int strikeCount(Ball ball) {
        Ball answerBall = this.balls.get(ball.getPosition());
        if (answerBall.equals(ball)) {
            return 1;
        }
        return 0;
    }

    private int ballCount(Ball ball) {
        if (this.numbers.contains(ball.getNumber())) {
            return 1;
        }
        return 0;
    }
}
