package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(List<String> names) {
        cars = names.stream().map(name -> new Car(name)).collect(Collectors.toList());
    }

    public void moveBy(MoveStrategy moveStrategy) {
        cars.stream().forEach(car -> car.move(moveStrategy));
    }

    public List<CarName> findWinners() {
        List<CarName> carNames = new ArrayList<>();
        Position maxPosition = findMaxPosition();

        for (Car car : cars) {
            if (car.has(maxPosition)) {
                carNames.add(car.getCarName());
            }
        }
        return carNames;
    }

    private Position findMaxPosition() {
        Position maxPosition = new Position();
        for (Car car : cars) {
            if (maxPosition.lessThan(car.getPosition())) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }

    public List<Car> getCars() {
        return cars;
    }
}
