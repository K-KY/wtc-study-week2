package baseball;

import baseball.NumberGenerator.NumberGenerator;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClassTest extends NsTest {

    @Test
    void 두_객체가_같아야한다() {
        NumberGenerator n1 = NumberGenerator.getInstance();
        NumberGenerator n2 = NumberGenerator.getInstance();
        assertThat(n1).isEqualTo(n2);
        assertThat(n1.getGeneratedNumbers()).isEqualTo(n2.getGeneratedNumbers());
    }
    @Override
    protected void runMain() {
        Application.main(new String[] {});
    }
}
