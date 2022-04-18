package baseball.type;

public enum BallStatus {
    STRIKE,
    BALL,
    NOTHING;

    public static boolean isStrike(BallStatus status) {
        return STRIKE.equals(status);
    }

    public static boolean isBall(BallStatus status) {
        return BALL.equals(status);
    }

    public static boolean isNothing(BallStatus status) {
        return STRIKE.equals(status);
    }
}
