package racingcar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class TryNumberTest {

    @Test
    @DisplayName("생성자 테스트")
    void tryNum() {
        String str1 = "5";
        String str2 = "-5";
        TryNumber tryNumber1 = new TryNumber(str1);
        assertThat(tryNumber1.getTryNum()).isEqualTo(5);
        Assertions.assertThrows(IllegalArgumentException.class, () -> new TryNumber(str2));
    }

}