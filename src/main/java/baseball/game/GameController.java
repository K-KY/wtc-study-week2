package baseball.game;

import baseball.NumberGenerator.NumberGenerator;
import baseball.output.SystemOutput;
import baseball.userinput.UserInput;

public class GameController {
    private final NumberCompare numberCompare = new NumberCompare();
    private final SystemOutput systemOutput = new SystemOutput();
    private boolean progress = true;

    public void gameStart() {
        UserInput userInput = UserInput.getInstance();
        userInput.userInput();
        numberCompare.compare();
        checkEnd();
    }

    public void checkEnd() {
        if (numberCompare.strike != 3) {
            gameStart();
        }
        if (numberCompare.strike == 3 && progress) {
            progress = false;
            if (systemOutput.gameEnd()) {
                progress = true;
                NumberGenerator.getInstance().reset();
                gameStart();
            }
        }
    }
}
