package domain;

import java.util.Objects;

public class Position {
    private final int position;
    private static final int MovingDistance = 1;

    public Position(int position) {
        this.position = position;
    }

    public Position move() {
        return new Position(position + MovingDistance);
    }

    public boolean isGreatThanOrEqual(Position maxPosition) {
        return position >= maxPosition.getPosition();
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

}
