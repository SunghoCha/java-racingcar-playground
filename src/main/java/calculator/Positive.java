package calculator;

public class Positive {
    private int number;
    public Positive(String value) {
        int num = Integer.parseInt(value);

        if (num < 0) {
            throw new RuntimeException();
        }
        this.number = num;
    }

    public int getNumber() {
        return number;
    }
}
