package racingcar;

import org.junit.jupiter.api.Test;

public class CheckStringTest {

    @Test
    void 문자열입력_분할() {
        String value = "pobi,crong,honux";
        CheckString.divide(value);
    }
}
