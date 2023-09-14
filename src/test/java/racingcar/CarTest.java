package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("자동차");
    }

    @Test
    @DisplayName("move함수 테스트")
    void 자동차_전진거리_테스트() {
        car.move();
        car.move();
        // move 조건에 랜덤요소가 들어가 있는데 테스트방법은?
        assertThat(car.getPosition()).isEqualTo(2);
    }

}