package racingcar;

public class TryNumber {

    private final int tryNum;

    private TryNumber(int tryNum) {
        if (tryNum < 0) {
            throw new IllegalArgumentException();
        }
        this.tryNum = tryNum;
    }

    public  TryNumber(String tryNum) {
        this(Integer.parseInt(tryNum));
    }

    public int getTryNum() {
        return tryNum;
    }
}
