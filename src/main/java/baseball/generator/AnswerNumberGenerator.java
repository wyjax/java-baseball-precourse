package baseball.generator;

import nextstep.utils.Randoms;

import java.util.HashSet;
import java.util.Set;

public class AnswerNumberGenerator {

    public String createAnswer(int length) {
        Set<Integer> characterSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        while (characterSet.size() < length) {
            int newNumber = createNumber(characterSet);
            characterSet.add(newNumber);
            sb.append(newNumber);
        }

        return sb.toString();
    }

    private int createNumber(Set<Integer> characterSet) {
        int num;

        do {
            num = Randoms.pickNumberInRange(1, 9);
        } while (characterSet.contains(num));

        return num;
    }
}
