package baseball.controller;


import baseball.GameConstants;
import baseball.service.GameService;
import baseball.view.GameView;

public class GameController {
    private final GameService gameService;
    private final GameView gameView;

    public GameController() {
        this.gameService = new GameService();
        this.gameView = new GameView();
    }

    public void requestStart() {
        this.gameView.printMessage(GameConstants.START_GAME_MESSAGE);
        gameService.run();
    }
}
