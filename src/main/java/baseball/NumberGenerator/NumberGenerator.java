package baseball.NumberGenerator;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberGenerator {
    private final List<Integer> generatedNumbers = new ArrayList<>();
    public NumberGenerator{
        numberGenerate();
    }
    //번호를 생성
    private void numberGenerate() {
        while (generatedNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!generatedNumbers.contains(randomNumber)) {
                generatedNumbers.add(randomNumber);
            }

        }
    }


    //생성된 번호를 리턴한다
    public List<Integer> getGeneratedNumbers() {
        //수정 불가능한 상태로 리턴한다
        return Collections.unmodifiableList(generatedNumbers);
    }
}