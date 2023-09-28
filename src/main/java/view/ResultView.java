package view;

import domain.CarName;

import java.util.List;
import java.util.Map;

public class ResultView {

    public static void printFrom(Map<String, Integer> results) {
        for (String carName : results.keySet()) {
            System.out.print(carName + ": ");
            print(results.get(carName));
            System.out.println();
        }
        System.out.println();
    }


    private static void print(int distance) {
        for (int i = 0; i < distance; i++) {
            System.out.print("-");
        }
    }

    public static void printWinner(List<String> winners) {

        for (int i = 0; i < winners.size(); i++) {
            if (isLastCar(winners, i)) {
                System.out.printf("%s가 최종 우승했습니다.", winners.get(i));
                break;
            }
            System.out.printf("%s, ", i);

        }
    }

    private static boolean isLastCar(List<String> winners, int i) {
        return i == winners.size() - 1;
    }
}
