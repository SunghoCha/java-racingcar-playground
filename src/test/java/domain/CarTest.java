package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void moveBy() {
        Car car = new Car("pobi");
        car.moveBy(() -> true);
        assertThat(car.getPosition()).isEqualTo(new Position(1));
    }

    @Test
    void isGreatThanOrEqual() {
        Car longCar = Car.CreateFinishedCar("long", 30);
        Position position = new Position(3);
        assertThat(longCar.hasGreatThanOrEqual(position)).isTrue();
    }

    @Test
    void has() {
        Car longCar = Car.CreateFinishedCar("long", 30);
        Position position = new Position(30);
        assertThat(longCar.has(position)).isTrue();
    }

}