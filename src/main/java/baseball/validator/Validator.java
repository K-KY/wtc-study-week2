package baseball.validator;

public class Validator {
    //숫자가 아닌 값이 있는지 확인한다.
    public void validateType(String input) {
        if (!input.matches("(.*)[1-9](.*)")) {
            throw new IllegalArgumentException("숫자를 입력해주세요.");
        }
    }

}
