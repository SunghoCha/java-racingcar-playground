package racingcar;

import java.util.Scanner;

public class InputView {

    private String getCarNames;
    private int TryNo;

    public static String[] getCarNames() {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String values = sc.next();
        String[] carNames = values.split(",");
        return carNames;
    }

    public static int getTryNo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("시도할 회수는 몇회인가요?");
        return Integer.parseInt(sc.next());
    }
}
