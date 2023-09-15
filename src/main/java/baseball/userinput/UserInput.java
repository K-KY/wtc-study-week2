package baseball.userinput;

import baseball.validator.Validator;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class UserInput {
    private final List<Integer> userInputNumber = new ArrayList<>();
    private UserInput() {
    }
    //싱글톤 패턴으로 객체가 하나만 생성되게 만든다
    private static class UserInputSingleton {
        private static final UserInput userInput = new UserInput();
    }
    //싱글톤 객체를 리턴한다
    public static UserInput getInstance() {
        return UserInputSingleton.userInput;
    }

    public void userInput() {
        userInputNumber.clear();
        Validator validator = new Validator();
        System.out.print("숫자를 입력해주세요 : ");
        String userNumber = Console.readLine();
        System.out.println();
        userInputNumber.addAll(validator.validateNumber(userNumber));
    }

    public List<Integer> getUserInputNumber() {
        return userInputNumber;
    }
}
