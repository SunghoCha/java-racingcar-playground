package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCars {

    private final List<Car> cars;

    private RacingCars(List<Car> cars) {
        this.cars = cars;
    }

    public static RacingCars createRacingCars(List<String> names) {
        List<Car> cars = names.stream().map(Car::new).collect(Collectors.toList());
        return new RacingCars(cars);
    }

    public static RacingCars createFinishedCars(List<Car> cars) {
        return new RacingCars(cars);
    }

    public void move(MovementStrategy movementStrategy) {
        cars.stream().forEach(car -> car.moveBy(movementStrategy));
    }

    public List<CarName> findWinner() {
        Position maxPosition = getMaxPosition();
        List<CarName> Winners = new ArrayList<>();

        for (Car car : cars) {
            if (car.has(maxPosition)) {
                Winners.add(car.getCarName());
            }
        }
        return Winners;
    }

    private Position getMaxPosition() {
        Position maxPosition = new Position(0);
        for (Car car : cars) {
            if (car.hasGreatThanOrEqual(maxPosition)) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }

    public List<Car> getCars() {
        return cars;
    }
}
