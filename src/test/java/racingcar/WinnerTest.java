package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class WinnerTest {

    private List<Integer> positions = Arrays.asList(3, 4, 4);

    @Test
    void findIdxList() {
        List<Integer> idxList = Winner.findIdxList(positions);
        assertThat(idxList.size()).isEqualTo(2);
        assertThat(idxList.get(0)).isEqualTo(1);
        assertThat(idxList.get(1)).isEqualTo(2);
    }

    @Test
    @DisplayName("최대값 찾기")
    void findMax() {
        assertThat(Winner.findMax(positions)).isEqualTo(4);
    }
}