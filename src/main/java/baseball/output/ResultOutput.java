package baseball.output;

import baseball.game.NumberCompare;

public class ResultOutput {
    public void resultOutput(NumberCompare numberCompare) {
        printBall(numberCompare.ball);
        printStrike(numberCompare.strike);
        System.out.println();
    }
    private void printBall(int ball) {
        if (ball != 0) {
            System.out.print(ball + "볼 ");
        }
    }
    private void printStrike(int Strike) {
        if (Strike != 0) {
            System.out.print(Strike + "스트라이크 ");
        }
    }
}
