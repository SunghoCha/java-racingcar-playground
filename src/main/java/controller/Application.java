package controller;

import domain.CarName;
import domain.RacingService;
import view.InputView;
import view.ResultView;

import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        String carString = inputView.getValue();
        int tryNum = inputView.getTryNum();

        RacingService racingService = new RacingService(carString, tryNum);

        while (!racingService.isEnd()) {
            racingService.race();
            Map<String, Integer> results = racingService.getResult();
            ResultView.printFrom(results);
        }
        List<String> winners = racingService.findWinner();
        ResultView.printWinner(winners);
    }
}
