package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RacingServiceTest {

    private RacingCars finishedCars;
    private RacingService racingService;

    @BeforeEach
    void setUp() {
        int TryNumber = 2;
        finishedCars = RacingCars.createFinishedCars(Arrays.asList(
                Car.CreateFinishedCar("pobi", 3),
                Car.CreateFinishedCar("crong", 1),
                Car.CreateFinishedCar("honux", 3))
        );
        racingService = RacingService.afterRace(finishedCars, TryNumber);
    }

    @Test
    @DisplayName("레이스 진행 후 경기 끝난 상황 체크")
    void race_isEnd_테스트() {
        racingService.race();
        assertThat(racingService.isEnd()).isFalse();
        racingService.race();
        assertThat(racingService.isEnd()).isTrue();
    }

//    private static List<String> carNameListFrom(String CarString) {
//        return Arrays.stream(CarString.split(",")).collect(Collectors.toList());
//    }

    @ParameterizedTest
    @CsvSource(value = {"pobi:3", "crong:1", "honux:3"}, delimiter = ':')
    void getResult(String carName, int distance) {
        //given
        //when
        Map<String, Integer> result = racingService.getResult();
        //then
        assertThat(result.size()).isEqualTo(3);
        assertThat(result.get(carName)).isEqualTo(distance);
    }

    @ParameterizedTest
    @CsvSource(value = {"0:pobi", "1:honux"}, delimiter = ':')
    void findWinner(int idx, String carName) {
        List<String> winner = racingService.findWinner();
        assertThat(winner.size()).isEqualTo(2);
        assertThat(winner.get(idx)).isEqualTo(carName);
    }


}