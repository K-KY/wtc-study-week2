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
    void findStrike() {
        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i).equals(user.get(i))) {
                strike++;
            }
        }
    }
    void findBall() {
        computer.forEach(v -> {
            if (user.contains(v)) {
                ball++;
            };
        });
        //contains 를 사용해서 strike 여도 ball 이 올라간다.
        //{1,2,3} ,{1,3,2} 일 경우 strike = 1, ball = 3
        //그래서 ball 에서 strike 만큼 빼준다.
        ball = ball - strike;
    }

    //user.size() = 3, ball = 1, strike = 1 일 때 낫싱은 3 - (ball + strike)
    void findNothing() {
        nothing = user.size() - (ball + strike);
    }
}
