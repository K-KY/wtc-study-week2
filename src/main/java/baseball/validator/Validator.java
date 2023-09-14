package baseball.validator;

import baseball.userinput.IntegerParsing;

import java.util.Arrays;
import java.util.List;

public class Validator {
    //검증 메소드를 모두 호출하고 리스트를 리턴한다.
    public List<Integer> validateNumber(String input) {
        try{
            validateType(input);
            validateNumberRange(input);
            validateNumberLength(input);
            validateNumberDuplicate(input);

        }catch (Exception e) {
            //에러 메세지 출력
            System.out.println(e.getMessage());
            //에러 로그 출력
            e.printStackTrace();
        }
        //String 타입의 리스트를 Integer 타입으로 변경
        return new IntegerParsing().toInteger(input.split(""));
    }
    //숫자가 아닌 값이 있는지 확인한다.
    private void validateType(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!String.valueOf(input.charAt(i)).matches("(.*)[0-9](.*)")) {
                throw new IllegalArgumentException("숫자를 입력해주세요.");
            }
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
