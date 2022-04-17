package baseball.model;

import baseball.type.BallStatus;

public class Ball {
    private final int position;
    private final int number;

    public Ball(int position, int number) {
        this.position = position;
        this.number = number;
    }

    public BallStatus status(Ball ball) {
        if (this.equals(ball)) {
            return BallStatus.STRIKE;
        } else if (matchedNumber(ball.number)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean matchedNumber(int number) {
        return this.number == number;
    }

    @Override
    public boolean equals(Object obj) {
        Ball ball = (Ball) obj;
        if (this == ball) {
            return true;
        }
        return this.position == ball.position && this.number == ball.number;
    }
}
