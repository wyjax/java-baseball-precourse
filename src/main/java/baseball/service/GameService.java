package baseball.service;

import baseball.domain.GameModel;
import baseball.generator.AnswerNumberGenerator;
import baseball.type.GameStatus;
import baseball.view.GameView;

import static baseball.GameConstants.*;

public class GameService {
    private final AnswerNumberGenerator numberGenerator = new AnswerNumberGenerator();
    private final GameView gameView = new GameView();

    public void run() {
        do {
            startGame();
        } while (isContinueGame());
        endGame();
    }

    private void startGame() {
        GameModel gameModel = new GameModel(numberGenerator.createAnswer(ANSWER_LENGTH));

        do {
            String input = gameView.viewInputAnswer();
            gameModel.match(input);
            gameView.printMessage(gameModel.getResultMessage());
        } while (gameModel.isNotSuccess());
        gameView.printMessage(GAME_SUCCESS_MESSAGE);
    }

    private boolean isContinueGame() {
        GameStatus status = gameView.viewContinue();

        return GameStatus.CONTINUE.equals(status);
    }

    private void endGame() {
        gameView.printMessage(END_GAME_MESSAGE);
    }
}
