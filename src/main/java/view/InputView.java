package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputView {
    private String value;
    private final int tryNum;
    private final String stringPattern = "^((([a-zA-Z0-9]{1,5}+)[,]){1,9}+)[a-z0-9_-]$";

    public InputView() {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String inputValue = sc.next();

        if (!Pattern.matches(stringPattern, inputValue)) {
            throw new IllegalArgumentException("올바른 입력이 아닙니다.");
        }
        this.value = inputValue;

        System.out.println("시도할 회수는 몇회인가요?");
        int inputNumber = sc.nextInt();

        if (inputNumber < 1) {
            throw new NumberFormatException("0보다 큰 횟수를 입력해주세요");
        }
        this.tryNum = inputNumber;
    }

    public String getValue() {
        return value;
    }

    public int getTryNum() {
        return tryNum;
    }
}
