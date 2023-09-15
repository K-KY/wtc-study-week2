package baseball.NumberGenerator;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberGenerator {
    private final List<Integer> generatedNumbers = new ArrayList<>();
    private NumberGenerator() {
        numberGenerate();
    }
    //싱글톤 패턴으로 객체가 하나만 생성되게 만든다
    private static class GeneratorSingleton {
        private static final NumberGenerator generator = new NumberGenerator();
    }
    //싱글톤 객체를 리턴한다
    public static NumberGenerator getInstance() {
        return GeneratorSingleton.generator;
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

    public void reset() {
        generatedNumbers.clear();
        numberGenerate();
    }

    //생성된 번호를 리턴한다
    public List<Integer> getGeneratedNumbers() {
        //수정 불가능한 상태로 리턴한다
        return Collections.unmodifiableList(generatedNumbers);
    }
}