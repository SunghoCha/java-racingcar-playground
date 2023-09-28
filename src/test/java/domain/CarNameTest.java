package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarNameTest {

    @Test
    void CarName유효성검사() {
        assertThrows(IllegalArgumentException.class, () -> new CarName("abcdef"));
    }
}