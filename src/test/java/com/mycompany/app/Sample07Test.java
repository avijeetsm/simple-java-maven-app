package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample07Test {

    @Test
    void idReturnsConstant() {
        assertEquals(7, Sample07.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 7, Sample07.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 7, Sample07.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(7 * 7, Sample07.squared());
    }
}
