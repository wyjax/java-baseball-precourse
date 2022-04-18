package baseball.service;

import baseball.model.Balls;
import baseball.model.GameResult;
import baseball.view.GameView;

import java.util.List;

public class BaseBallGame {
    private static final int NUMBER_LENGTH = 3;
    private GameView gameView = new GameView();
    private RandomGenerator generator = new RandomGenerator();

    public void run() {
        do {
            start();
            gameView.complete(NUMBER_LENGTH);
        } while (isRestart());
    }

    private void start() {
        boolean isRunning = true;
        List<Integer> numbers = generator.create();
        Balls answerBalls = new Balls(numbers);
        while (isRunning) {
            List<Integer> inputNumbers = gameView.inputNumber(NUMBER_LENGTH);
            Balls inputBalls = new Balls(inputNumbers);
            GameResult result = answerBalls.result(inputBalls);
            gameView.inputResult(result);
            isRunning = result.isContinue();
        }
    }

    private boolean isRestart() {
        return gameView.restart();
    }
}
