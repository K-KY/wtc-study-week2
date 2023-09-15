package baseball.output;

import baseball.game.NumberCompare;

public class ResultOutput {
    public void resultOutput(NumberCompare numberCompare) {
        System.out.println(numberCompare.strike);
        System.out.println(numberCompare.ball);
        System.out.println(numberCompare.nothing);
    }
}
