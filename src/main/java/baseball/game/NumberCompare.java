package baseball.game;

import baseball.NumberGenerator.NumberGenerator;
import baseball.output.ResultOutput;
import baseball.userinput.UserInput;

import java.util.List;

public class NumberCompare {
    private final List<Integer> computer = NumberGenerator.getInstance().getGeneratedNumbers();
    private final List<Integer> user = UserInput.getInstance().getUserInputNumber();
    public int strike = 0;
    public int ball = 0;
    public int nothing = 0;

    public void compare() {
        ResultOutput resultOutput = new ResultOutput();
        init();
        findStrike();
        findBall();
        findNothing();
        resultOutput.resultOutput(this);
    }


    private void findStrike() {
        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i).equals(user.get(i))) {
                strike++;
            }
        }
    }
    //contains 를 사용해서 strike 여도 ball 이 올라간다.
    //{1,2,3} ,{1,3,2} 일 경우 strike = 1, ball = 3
    //그래서 ball 에서 strike 만큼 빼준다.
    private void findBall() {
        computer.forEach(v -> {
            if (user.contains(v)) {
                ball++;
            }
        });
        ball = ball - strike;
    }

    //user.size() = 3, ball = 1, strike = 1 일 때 낫싱은 3 - (ball + strike)
    private void findNothing() {
        nothing = user.size() - (ball + strike);
    }

    private void init() {
        this.strike = 0;
        this.nothing = 0;
        this.ball = 0;
    }
}
