package baseball.domain;

import baseball.GameConstants;

import java.util.HashMap;
import java.util.Map;

public class GameModel {
    private final Map<Character, Integer> answerMap;
    private int strike;
    private int ball;

    public GameModel(String answer) {
        this.answerMap = new HashMap<>();
        int len = answer.length();

        for (int i = 0; i < len; i++) {
            char c = answer.charAt(i);
            answerMap.put(c, i);
        }
    }

    public void match(String input) {
        initMatchResult();
        int length = input.length();

        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            calculateCharacter(c, i);
        }
    }

    private void initMatchResult() {
        this.strike = 0;
        this.ball = 0;
    }

    private void calculateCharacter(char c, int idx) {
        if (answerMap.containsKey(c) && answerMap.get(c) == idx) {
            this.strike++;
        } else if (answerMap.containsKey(c)) {
            this.ball++;
        }
    }

    public String getResultMessage() {
        if (strike == 0 && ball == 0) {
            return GameConstants.NOT_THING;
        }
        StringBuilder sb = new StringBuilder(getStrikeMessage());
        sb.append(getBallMessage());

        return sb.toString();
    }

    private String getStrikeMessage() {
        if (strike == 0) {
            return GameConstants.EMPTY_STRING;
        }
        return strike + GameConstants.STRIKE;
    }

    private String getBallMessage() {
        if (ball == 0) {
            return GameConstants.EMPTY_STRING;
        }
        return ball + GameConstants.BALL;
    }

    public boolean isNotSuccess() {
        return !isSuccess();
    }

    public boolean isSuccess() {
        return strike == GameConstants.ANSWER_LENGTH;
    }
}
