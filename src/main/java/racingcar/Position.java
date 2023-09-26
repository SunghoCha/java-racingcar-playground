package racingcar;

import java.util.Objects;

public class Position {

    private int position;

    public Position(int position) {
        if (position < 0) {
            throw new IllegalArgumentException();
        }
        this.position = position;
    }

    public Position() {
        this.position = 0;
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

    public Position move() {
        return new Position(this.position + 1);
    }

    public boolean lessThan(Position position) {
        return this.position < position.position;
    }

    public int getPosition() {
        return position;
    }
}
