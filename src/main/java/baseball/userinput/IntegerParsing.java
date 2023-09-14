package baseball.userinput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerParsing {
    public List<Integer> toInteger(String[] userInput) {
        List<Integer> parsed = new ArrayList<>();
        Arrays.asList(userInput).forEach(v ->{
            parsed.add(Integer.parseInt(v));
        });
        return parsed;
    }
}
