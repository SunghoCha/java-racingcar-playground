package racingcar;

public class Car {

    private final CarName carName;
    private Position position;

    public Car(String carName) {
        this.carName = new CarName(carName);
        this.position = new Position();
    }

    public void move(MoveStrategy moveStrategy) {
        if (moveStrategy.movable()) {
            this.position = position.move();
        }
    }

    public boolean has(Position position) {
        return this.position.equals(position);
    }

    public CarName getCarName() {
        return carName;
    }

    public Position getPosition() {
        return position;
    }

    public String findCarName() {
        return carName.getCarName();
    }

    public int findPosition() {
        return position.getPosition();
    }
}
