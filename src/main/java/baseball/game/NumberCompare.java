package baseball.game;

import baseball.NumberGenerator.NumberGenerator;
import baseball.userinput.UserInput;

import java.util.List;

public class NumberCompare {
    UserInput userInput = new UserInput();
    List<Integer> computer = NumberGenerator.getInstance().getGeneratedNumbers();
    List<Integer> user = userInput.getUserInputNumber();
    int strike = 0;
    int ball = 0;
    int nothing  = 0;

    void userAndComputerEquals() {
        if (computer == user) {
            strike += 3;
        }
    }
}
