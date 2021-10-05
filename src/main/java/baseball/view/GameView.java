package baseball.view;

import baseball.type.GameStatus;
import baseball.utils.StringUtils;
import nextstep.utils.Console;

import java.util.HashSet;
import java.util.Set;

import static baseball.GameConstants.*;

public class GameView {

    public String viewInputAnswer() {
        printMessage(NUMBER_GUIDE_MESSAGE);
        String input;

        do {
            input = Console.readLine();
        } while (isInValidInputAnswer(input));

        return input;
    }

    private boolean isInValidInputAnswer(String input) {
        try {
            checkNumeric(input);
            checkAnswerLength(input);
            checkDuplicateNumber(input);
            checkAnswerRange(input);
        } catch (Exception e) {
            printErrorMessage(e.getMessage());
            return true;
        }
        return false;
    }

    private void checkAnswerLength(String input) {
        if (ANSWER_LENGTH != input.length()) {
            throw new IllegalArgumentException(ANSWER_LENGTH_ERROR_MESSAGE);
        }
    }

    private void checkAnswerRange(String input) {
        boolean isInValid = false;

        for (char c : input.toCharArray()) {
            isInValid = isInValid || c == ZERO_CHAR;
        }

        if (isInValid) {
            throw new IllegalArgumentException(ANSWER_RANGE_ERROR_MESSAGE);
        }
    }

    private void checkDuplicateNumber(String input) {
        Set<Character> set = new HashSet<>();

        for (char c : input.toCharArray()) {
            set.add(c);
        }

        if (set.size() != input.length()) {
            throw new IllegalArgumentException(DUPLICATE_NUMBER_ERROR_MESSAGE);
        }
    }

    public GameStatus viewContinue() {
        printMessage(CONTINUE_GUIDE_MESSAGE);
        String input;

        do {
            input = Console.readLine();
        } while (isInValidContinueInput(input));

        int num = Integer.parseInt(input);

        return GameStatus.of(num);
    }

    private boolean isInValidContinueInput(String input) {
        try {
            checkNumeric(input);
            checkContinueNumberRange(input);
        } catch (Exception e) {
            printErrorMessage(e.getMessage());
            return true;
        }
        return false;
    }

    private void checkNumeric(String input) {
        if (!StringUtils.isNumeric(input)) {
            throw new IllegalArgumentException(NON_NUMERIC_ERROR_MESSAGE);
        }
    }

    private void checkContinueNumberRange(String input) {
        int num = Integer.parseInt(input);

        if (num != 1 && num != 2) {
            throw new IllegalArgumentException(GAME_CONTINUE_ERROR_MESSAGE);
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printErrorMessage(String message) {
        System.out.println(ERROR_PREFIX + message);
    }
}
