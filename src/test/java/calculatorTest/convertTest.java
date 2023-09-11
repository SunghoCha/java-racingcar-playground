package calculatorTest;

import calculator.Converter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.*;

public class convertTest {

    private Converter cv;

    @BeforeEach
    void setUp() {
        cv = new Converter();
    }

    @Test
    void 빈_문자열_null값_입력시_0반환() {
        String value1 = "";
        String value2 = null;

        assertThat(cv.convert(value1)).isEqualTo(0);
        assertThat(cv.convert(value2)).isEqualTo(0);
    }

    @Test
    void 숫자_하나를_문자열_입력시_해당숫자_반환() {
        String value = "1";

        assertThat(cv.convert(value)).isEqualTo(1);
    }

    @Test
    void 숫자_두개를_컴마구분자로_입력시_숫자합_반환() {
        String value = "1,2";

        assertThat(cv.convert(value)).isEqualTo(3);
    }

    @Test
    void 컴마_콜론구분자로_입력시_숫자합_반환() {
        String value = "1,2:3";

        assertThat(cv.convert(value)).isEqualTo(6);
    }

    @Test
    void 커스텀_구분자_숫자합_반환() {
        String value = "//;\n1;2;3";

        assertThat(cv.convert(value)).isEqualTo(6);
    }

    @Test
    void 음수_예외발생() {
        String value = "-1,2,3";

        assertThatThrownBy(() -> cv.convert(value)).isInstanceOf(RuntimeException.class);
    }

}






