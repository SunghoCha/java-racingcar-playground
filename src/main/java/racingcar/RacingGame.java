package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private final Cars cars;
    private int tryNum;

    public RacingGame(String[] carNames, int tryNum) {
        List<String> names = createCarList(carNames);
        this.cars = new Cars(names);
        this.tryNum = tryNum;
    }

    private static List<String> createCarList(String[] carNames) {
        List<String> names = new ArrayList<>();
        for (String carName : carNames) {
            names.add(carName);
        }
        return names;
    }

    public boolean isEnd() {
        return tryNum == 0;
    }

    public Cars getCars() {
        return cars;
    }

    public List<CarName> getWinners() {
        return cars.findWinners();
    }

    public void race() {
        tryNum--;
        MoveStrategy randomStrategy = new RandomStrategy();
        cars.moveBy(randomStrategy);
    }
}
