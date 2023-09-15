package baseball.game;

import baseball.userinput.UserInput;

public class GameController {
    private final NumberCompare numberCompare = new NumberCompare();
    public void gameStart() {
        UserInput userInput = UserInput.getInstance();
        userInput.userInput();
        numberCompare.compare();
        gameEnd();
    }
    public void gameEnd() {
        if (numberCompare.strike != 3) {
            gameStart();
        }
    }
}
