package baseball;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RandomGenerator {
    private static final int DEFAULT_SIZE = 3;
    private static final int START_NUMBER = 1;
    private static final int END_NUMBER = 9;

    public List<String> create() {
        return create(DEFAULT_SIZE);
    }

    public List<String> create(int size) {
        Set<String> result = new LinkedHashSet<>();

        while (result.size() < size) {
            int newNumber = Randoms.pickNumberInRange(START_NUMBER, END_NUMBER);
            result.add(String.valueOf(newNumber));
        }
        return new ArrayList<>(result);
    }
}
