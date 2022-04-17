package baseball.model;

import baseball.type.BallStatus;

public class GameResult {
    private int strike = 0;
    private int ball = 0;

    public void addResult(BallStatus status) {
        if (BallStatus.isStrike(status)) {
            this.strike++;
        } else if (BallStatus.isBall(status)) {
            this.ball++;
        }
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public boolean isNothing() {
        return this.strike == 0 && this.ball == 0;
    }

    public boolean hasStrike() {
        return this.strike > 0;
    }

    public boolean hasBall() {
        return this.ball > 0;
    }

    public boolean isContinue() {
        return this.strike != 3;
    }
}
