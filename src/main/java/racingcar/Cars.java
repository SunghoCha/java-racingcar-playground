package racingcar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(String[] values) {
        this.cars = Arrays.stream(values).map(Car::new).collect(Collectors.toList());
    }

    public void move() {
        cars.stream().forEach(car -> car.move());
    }
    public List<Integer> getPositions() {
        return cars.stream().map(car -> car.getPosition()).collect(Collectors.toList());
    }

    public List<String> getNames() {
        return cars.stream().map(car -> car.getName()).collect(Collectors.toList());
    }
}
