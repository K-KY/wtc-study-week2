package baseball.userinput;

import baseball.validator.Validator;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class UserInput {
    private final List<String> userInputNumber = new ArrayList<>();
    public void userInput() {
        Validator validator = new Validator();
        System.out.print("숫자를 입력해주세요 : ");
        String userNumber = Console.readLine();
        System.out.println();
        userInputNumber.addAll(validator.validateNumber(userNumber));
    }

    public List<String> getUserInputNumber() {
        return userInputNumber;
    }
}
