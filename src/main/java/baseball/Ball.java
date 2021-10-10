package baseball;

public class Ball {
    private final int position;
    private final int ballNum;

    public Ball(int position, int ballNum) {
        this.position = position;
        this.ballNum = ballNum;
    }

    public BallStatus play(Ball ball) {
        if (this.equals(ball)) {
            return BallStatus.STRIKE;
        }
        if (ball.matchBallNo(ballNum)) {
            return BallStatus.BALL;
        }

        return BallStatus.NOT_THING;
    }

    private boolean matchBallNo(int ballNum) {
        return this.ballNum == ballNum;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
