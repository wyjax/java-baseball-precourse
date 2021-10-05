package baseball;

public class GameConstants {
    public static final int ANSWER_LENGTH = 3;
    public static final String STRIKE = "스트라이크 ";
    public static final String BALL = "볼 ";
    public static final String NOT_THING = "낫싱";
    public static final String ERROR_PREFIX = "[ERROR] : ";
    public static final char ZERO_CHAR = '0';

    public static final String EMPTY_STRING = "";
    public static final String START_GAME_MESSAGE = "[야구게임] 시작";
    public static final String END_GAME_MESSAGE = "[야구게임] 종료";
    public static final String GAME_SUCCESS_MESSAGE = ANSWER_LENGTH + "개의 숫자를 모두 맞히셨습니다! 게임 끝";
    public static final String NUMBER_GUIDE_MESSAGE = "숫자를 입력해주세요 : ";
    public static final String CONTINUE_GUIDE_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력해주세요.";

    public static final String GAME_CONTINUE_ERROR_MESSAGE = "1 또는 2를 입력해주세요.";
    public static final String DUPLICATE_NUMBER_ERROR_MESSAGE = "중복된 값을 입력할 수 없습니다.";
    public static final String NON_NUMERIC_ERROR_MESSAGE = "숫자를 입력해주세요.";
    public static final String ANSWER_RANGE_ERROR_MESSAGE = "1~9사이의 서로 다른 숫자를 입력해주세요.";
    public static final String ANSWER_LENGTH_ERROR_MESSAGE = ANSWER_LENGTH + "자리 숫자를 입력해주세요.";
}
