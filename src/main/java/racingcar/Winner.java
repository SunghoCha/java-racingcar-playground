package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Winner {

    public static void getResult(Cars cars) {
        List<Integer> idxList = findIdxList(cars.getPositions());
        List<String> names = cars.getNames();
        List<Integer> winnerlist = new ArrayList<>();
        int size = idxList.size();
        printWinner(size, names, idxList);

    }

    public static void printWinner(int size,List<String> names, List<Integer> idxList ) {
        for (int i = 0; i < size; i++) {
            if ( i == size-1) {
                System.out.printf( names.get((idxList.get(i))) );
            }
            if ( i != size-1)
                System.out.printf( names.get((idxList.get(i)))+", " );
            }
        System.out.printf("가 최종 우승했습니다.");

    }
    public static List<Integer> findIdxList(List<Integer> positions) {
        int max = findMax(positions);
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < positions.size(); i++) {
            if (positions.get(i) == max) {
                integerList.add(i);
            }
        }
        return integerList;
    }

    public static int findMax(List<Integer> integers) {
        int max = -1;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) > max) {
                max = integers.get(i);
            }
        } return max;
    }
}

