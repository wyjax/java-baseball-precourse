package baseball.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class RandomGeneratorTest {
    private RandomGenerator RandomGenerator = new RandomGenerator();

    @Test
    public void 서로다른숫자_create_테스트() {
        List<Integer> numbers = RandomGenerator.create();
        Set<Integer> setNumbers = new LinkedHashSet<>(numbers);

        Assertions.assertThat(numbers.size()).isEqualTo(setNumbers.size());
    }

    @Test
    public void input_개수만큼_create_테스트() {
        int size = 9;
        List<Integer> numbers = RandomGenerator.create(size);

        Assertions.assertThat(numbers.size()).isEqualTo(size);
    }
}