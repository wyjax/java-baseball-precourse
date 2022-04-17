package baseball.view;

import baseball.model.GameResult;
import baseball.util.StringUtils;
import nextstep.utils.Console;

import java.util.List;

public class GameView {
    private static final String RESTART_MODE = "1";
    private static final String EXIT_MODE = "2";

    public List<Integer> inputNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        return StringUtils.parseIntegerListFromString(input);
    }

    public void inputResult(GameResult result) {
        if (result.isNothing()) {
            System.out.println("낫싱");
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (result.hasBall()) {
            sb.append(result.getBall() + "볼 ");
        }
        if (result.hasStrike()) {
            sb.append(result.getStrike() + "스트라이크 ");
        }
        System.out.println(sb);
    }

    public void complete(int size) {
        System.out.println(size + "개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public boolean restart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();

        if (RESTART_MODE.equals(input)) {
            return true;
        } else if (EXIT_MODE.equals(input)) {
            return false;
        }
        throw new IllegalArgumentException();
    }
}
