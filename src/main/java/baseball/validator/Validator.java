package baseball.validator;

import java.util.Arrays;
import java.util.List;

public class Validator {
    public void validateNumber(String input) {
        validateType(input);
        validateNumberRange(input);
        validateNumberLength(input);
        validateNumberDuplicate(input);
    }
    //숫자가 아닌 값이 있는지 확인한다.
    private void validateType(String input) {
        if (!input.matches("(.*)[0-9](.*)")) {
            throw new IllegalArgumentException("숫자를 입력해주세요.");
        }
    }
    //0이 존재하는지 확인한다
    private void validateNumberRange(String input) {
        if (input.contains("0")) {
            throw new IllegalArgumentException("숫자 범위는 1 ~ 9 입니다");
        }
    }
    //길이가 3인지 확인한다
    private void validateNumberLength(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException("3개의 숫자를 입력해주세요");
        }
    }
    //숫자가 중복되는지 확인한다.
    private void validateNumberDuplicate(String input) {
        List<String> list = Arrays.asList(input.split(""));
        if (input.length() != list.stream().distinct().count()) {
            throw new IllegalArgumentException("중복되지 않는 숫자를 입력해주세요.");
        }

    }

}
