package view;

import java.util.Scanner;

public class InputView {
    private final String value;
    private final int tryNum;

    public InputView() {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        value = sc.next();
        System.out.println("시도할 회수는 몇회인가요?");
        tryNum = sc.nextInt();
    }

    public String getValue() {
        return value;
    }

    public int getTryNum() {
        return tryNum;
    }
}
