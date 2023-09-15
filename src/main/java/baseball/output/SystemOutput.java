package baseball.output;

import baseball.enums.SystemEnum;
import baseball.validator.Validator;
import camp.nextstep.edu.missionutils.Console;

public class SystemOutput {

    public void gameEnd() {
        Validator validator = new Validator();
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String userChoice = Console.readLine();
        int validatedNum = validator.validateUserChoice(userChoice);

    }
}