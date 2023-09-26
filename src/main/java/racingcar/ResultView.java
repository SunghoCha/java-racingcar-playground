package racingcar;

import java.util.List;

public class ResultView {

    public static void printCars(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.print(car.findCarName() + " : ");
            print(car.findPosition());
        }
        System.out.println();
    }

    public static void print(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void printWinners(List<CarName> winners) {
        for (int i = 0; i < winners.size(); i++) {

            if (i == winners.size() - 1) {
                System.out.print(winners.get(i).getCarName());
                System.out.print("가 최종 우승했습니다.");
                return;
            }
            System.out.print(winners.get(i).getCarName() + ", ");
        }
    }
}
