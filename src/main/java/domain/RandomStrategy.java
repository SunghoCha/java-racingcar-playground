package domain;

import java.util.Random;

public class RandomStrategy implements MovementStrategy{
    private static final int FIXNUMBER = 4;

    @Override
    public boolean movable() {
        return isGraterThanFIXNUMBER();
    }

    private static boolean isGraterThanFIXNUMBER() {
        return (new Random().nextInt(10) >= FIXNUMBER);
    }
}
