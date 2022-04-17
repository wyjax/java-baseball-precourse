package baseball.model;

import baseball.type.BallStatus;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private List<Ball> balls = new ArrayList<>();

    public Balls(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            Ball ball = new Ball(i + 1, number);
            this.balls.add(ball);
        }
    }

    public GameResult result(Balls inputBalls) {
        GameResult result = new GameResult();
        for (int i = 0; i < this.balls.size(); i++) {
            Ball answerBall = this.balls.get(i);
            Ball inputBall = inputBalls.balls.get(i);
            BallStatus ballStatus = answerBall.status(inputBall);
            result.addResult(ballStatus);
        }
        return result;
    }
}
