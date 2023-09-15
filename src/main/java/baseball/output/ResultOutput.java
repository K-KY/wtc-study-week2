package baseball.output;

import baseball.game.NumberCompare;

public class ResultOutput {
    public void resultOutput(NumberCompare numberCompare) {
        printBall(numberCompare.ball);
        printStrike(numberCompare.strike);

    }
    private void printBall(int ball) {
        if (ball != 0) {
            System.out.println(ball + "스트라이크 ");
        }
    }
    private void printStrike(int Strike) {
        if (Strike != 0) {
            System.out.println(Strike + "스트라이크 ");
        }
    }
}
