package racingcar;

import java.util.Objects;

public class CarName {
    private final String CarName;

    public String getCarName() {
        return CarName;
    }

    public CarName(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException();
        }
        this.CarName = carName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName = (CarName) o;
        return Objects.equals(CarName, carName.CarName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CarName);
    }
}
