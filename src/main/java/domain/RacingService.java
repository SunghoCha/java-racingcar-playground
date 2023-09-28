package domain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RacingService {

    private final RacingCars racingCars;
    private int TryNumber;

    public RacingService(String CarString, int TryNumber) {
        //if(CarString 유효성검사)
        List<String> carNames = carNameListFrom(CarString);
        racingCars = RacingCars.createRacingCars(carNames);
        this.TryNumber = TryNumber;
    }

    private RacingService(RacingCars racingCars, int TryNumber) {
        //if(CarString 유효성검사)
        this.racingCars = racingCars;
        this.TryNumber = TryNumber;
    }

    public static RacingService afterRace(RacingCars racingCars, int TryNumber) {
        return new RacingService(racingCars, TryNumber);
    }

    private static List<String> carNameListFrom(String CarString) {
        return Arrays.stream(CarString.split(",")).collect(Collectors.toList());
    }

    public void race() {
        TryNumber -= 1;
        MovementStrategy randomStrategy = new RandomStrategy();
        racingCars.move(randomStrategy);
    }

    public boolean isEnd() {
        return TryNumber == 0;
    }

    public Map<String, Integer> getResult() {
        Map<String, Integer> map = new HashMap<>();
         racingCars.getCars().stream().forEach(car ->map.put(car.getCarName().getCarName(),car.getPosition().getPosition()));
         return map;
    }

    public List<String> findWinner() {
         return racingCars.findWinner().stream().map(winner -> winner.getCarName()).collect(Collectors.toList());
    }
}
