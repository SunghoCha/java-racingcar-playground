package inputView;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.*;

public class InputViewTest {

    @Test
    @DisplayName("자동차이름이 5자리일 경우허용, 6자리일 경우 오류")
    void 정규식연습() {
        //given
        String value = "^((([a-zA-Z0-9]{1,5}+)[,]){1,9}+)[a-z0-9_-]$";
        //when
        boolean a5 = Pattern.matches(value, "abcde,b,c,d,e");
        boolean a6 = Pattern.matches(value, "abcdef,b,c,d,e");
        //then
        assertThat(a5).isTrue();
        assertThat(a6).isFalse();


    }


}
