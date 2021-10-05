package baseball.service;

import baseball.domain.GameModel;
import baseball.generator.AnswerNumberGenerator;
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
        int continueMenu = gameView.viewContinue();

        return continueMenu == 1;
    }

    private void endGame() {
        gameView.printMessage(END_GAME_MESSAGE);
    }
}
