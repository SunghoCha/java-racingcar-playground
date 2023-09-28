package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RacingCarsTest {

    private RacingCars racingCars;

    @BeforeEach
    void setUp() {
        List<String> names = Arrays.asList("pobi","crong","honux");
        racingCars = RacingCars.createRacingCars(names);
    }

    @Test
    void Cars생성테스트() {
        List<String> names = Arrays.asList("pobi","crong","honux");
        RacingCars racingCars = RacingCars.createRacingCars(names);
        assertThat(racingCars.getCars().size()).isEqualTo(names.size());
        assertThat(racingCars.getCars().get(0).getCarName()).isEqualTo(new CarName("pobi"));
        assertThat(racingCars.getCars().get(2).getCarName()).isEqualTo(new CarName("honux"));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2})
    void move(int element) {
        racingCars.move(() -> true);
        assertThat(racingCars.getCars().get(element).getPosition()).isEqualTo(new Position(1));
    }

    @Test
    void findWinner() {
        //given
        RacingCars finishedCars = RacingCars.createFinishedCars(Arrays.asList(
                Car.CreateFinishedCar("pobi", 3),
                Car.CreateFinishedCar("crong", 1),
                Car.CreateFinishedCar("honux", 3))
        );
        //when
        List<CarName> winners = finishedCars.findWinner();
        //then
        assertThat(winners.size()).isEqualTo(2);
        assertThat(winners.get(0)).isEqualTo(new CarName("pobi"));
        assertThat(winners.get(1)).isEqualTo(new CarName("honux"));


    }

}