package baseball.output;

import baseball.game.NumberCompare;

public class ResultOutput {
    public void resultOutput(NumberCompare numberCompare) {
        printBall(numberCompare.strike);
    }
    private void printBall(int ball) {
        if (ball != 0) {
            System.out.println(ball + "볼 ");
        }
    }
}
