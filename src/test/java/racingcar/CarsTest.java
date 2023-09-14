package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CarsTest {

    private Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars(CheckString.divide("pobi, crong, honux"));
    }

    @Test
    @DisplayName("move함수 테스트")
    void move() {
        cars.move();
        cars.move();
        List<Integer> positions = cars.getPositions();
        assertThat(positions.get(0)).isEqualTo(2);

    }

    @Test
    void getPositions() {
        cars.move();
        List<Integer> positions = cars.getPositions();
        assertThat(positions.get(0)).isEqualTo(1);
    }

    @Test
    void getNames() {
        List<String> names = cars.getNames();
        assertThat(names.get(0)).isEqualTo("pobi");
    }
}