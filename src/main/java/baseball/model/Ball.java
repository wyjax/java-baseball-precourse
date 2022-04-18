package baseball.model;

public class Ball {
    private final int position;
    private final int number;

    public Ball(int position, int number) {
        this.position = position;
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        Ball ball = (Ball) obj;
        if (this == ball) {
            return true;
        }
        return this.position == ball.position && this.number == ball.number;
    }

    public int getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }
}
