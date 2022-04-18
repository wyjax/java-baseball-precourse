package baseball.service;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RandomGenerator {
    private static final int DEFAULT_SIZE = 3;
    private static final int MAX_SIZE = 9;
    private static final int START_NUMBER = 1;
    private static final int END_NUMBER = 9;

    public List<Integer> create() {
        return create(DEFAULT_SIZE);
    }

    public List<Integer> create(int size) {
        if (size > MAX_SIZE) {
            throw new IllegalArgumentException();
        }
        Set<Integer> result = new LinkedHashSet<>();

        while (result.size() < size) {
            int newNumber = Randoms.pickNumberInRange(START_NUMBER, END_NUMBER);
            result.add(newNumber);
        }
        return new ArrayList<>(result);
    }
}
