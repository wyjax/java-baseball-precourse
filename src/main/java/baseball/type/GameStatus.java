package baseball.type;

public enum GameStatus {
    CONTINUE,
    SHUTDOWN;

    public static GameStatus of(int type) {
        if (type == 1) {
            return CONTINUE;
        }

        return SHUTDOWN;
    }
}
