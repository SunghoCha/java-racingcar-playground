package racingcar;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class DomianTest {

    @Test
    void Car인자_테스트() {
        Car car = new Car("pobi");
        assertThat(car.getPosition()).isEqualTo(new Position());
        car.move(() -> true);
        assertThat(car.getPosition()).isEqualTo(new Position(1));
        assertThat(car.getCarName()).isEqualTo(new CarName("pobi"));
    }

    @Test
    void Position_move() {
        Position position = new Position();
        assertThat(position.move()).isEqualTo(new Position(1));
    }

    @Test
    void Position_lessThan() {
        Position position = new Position(1);
        assertThat(new Position().lessThan(position)).isTrue();
    }

    @Test
    void Position생성시_유효하지않은입력시_대응() {
        assertThatThrownBy(() -> new Position(-1)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void CarName생성시_유효하지않은입력시_대응() {
        assertThatThrownBy(() -> new CarName("abcdef")).isInstanceOf(IllegalArgumentException.class);
    }

//    @Test
//    void Cars인자() {
//        List<String> names = Arrays.asList("pobi","crong","honux");
//        Cars cars = new Cars(names);
//        cars.moveBy(()->true);
//        cars.findWinners();
//
//    }

}
