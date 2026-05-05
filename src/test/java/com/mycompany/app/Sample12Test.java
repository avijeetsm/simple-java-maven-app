package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample12Test {

    @Test
    void idReturnsConstant() {
        assertEquals(12, Sample12.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 12, Sample12.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 12, Sample12.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(12 * 12, Sample12.squared());
    }
}
