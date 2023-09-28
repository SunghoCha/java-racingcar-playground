package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void move() {
        Position position = new Position(2);
        Position movedPosition = position.move();
        assertThat(movedPosition).isEqualTo(new Position(3));
    }

    @Test
    void isGreatThanOrEqual() {
        Position position = new Position(2);
        Position movedPosition = position.move();
        movedPosition.isGreatThanOrEqual(position);
        movedPosition.isGreatThanOrEqual(movedPosition);
    }


}