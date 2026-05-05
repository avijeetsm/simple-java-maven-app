package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample16Test {

    @Test
    void idReturnsConstant() {
        assertEquals(16, Sample16.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 16, Sample16.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 16, Sample16.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(16 * 16, Sample16.squared());
    }
}
