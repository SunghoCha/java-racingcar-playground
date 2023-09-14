package racingcar;

import java.util.List;

public class Play {

    public Play() {}

    public static void print(int num) {
        for (int j = 0; j < num; j++) {
            System.out.print("-");
        }
    }

    public static void start(Cars cars, TryNumber tryNumber) {
        System.out.println();
        System.out.println("실행 결과");
        int tryNum = tryNumber.getTryNum();
        List<String> names = cars.getNames();
        for (int i = 0; i < tryNum; i++) {
            cars.move();
            List<Integer> positions = cars.getPositions();
            printPosition(names, positions);
            System.out.println();
        }
        Winner.getResult(cars);

    }

    public static void printPosition(List<String> names, List<Integer> positions) {
        for (int j = 0; j < positions.size(); j++) {
            System.out.print(names.get(j) + " : ");
            print(positions.get(j));
            System.out.println();
        }
    }
}
