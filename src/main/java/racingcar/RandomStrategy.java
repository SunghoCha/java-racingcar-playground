package racingcar;

import java.util.Random;

public class RandomStrategy implements MoveStrategy {

    @Override
    public boolean movable() {
        return (4 <= (new Random().nextInt(9) + 1));
    }
}
