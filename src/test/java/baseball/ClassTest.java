package baseball;

import baseball.NumberGenerator.NumberGenerator;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ClassTest extends NsTest {

    @Test
    void 두_객체가_같아야한다() {
        NumberGenerator n1 = NumberGenerator.getInstance();
        NumberGenerator n2 = NumberGenerator.getInstance();
        assertThat(n1).isEqualTo(n2);
        assertThat(n1.getGeneratedNumbers()).isEqualTo(n2.getGeneratedNumbers());
    }
    @Test
    void 숫자가_아닐때_예외() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("1l2"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }
    @Test
    void 길이_초과() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("12345"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }
    @Override
    protected void runMain() {
        Application.main(new String[] {});
    }
}
