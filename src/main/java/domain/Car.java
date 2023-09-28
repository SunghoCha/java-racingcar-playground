package domain;

public class Car {

    private final CarName carName;
    private Position position;

    public Car(String name) {
        this.carName = new CarName(name);
        this.position = new Position(0);
    }

    private Car(String name,int distance) {
        this.carName = new CarName(name);
        this.position = new Position(distance);
    }

    public static Car CreateFinishedCar(String name, int distance) {
        return new Car(name, distance);
    }

    public void moveBy(MovementStrategy movementStrategy) {
        if (movementStrategy.movable()) {
            position = position.move();
        }
    }

    public boolean hasGreatThanOrEqual(Position maxPosition) {
        return position.isGreatThanOrEqual(maxPosition);
    }

    public boolean has(Position maxPosition) {
        return position.equals(maxPosition);
    }

    public CarName getCarName() {
        return carName;
    }

    public Position getPosition() {
        return position;
    }
}
