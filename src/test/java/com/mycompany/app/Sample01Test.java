package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample01Test {

    @Test
    void idReturnsConstant() {
        assertEquals(1, Sample01.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 1, Sample01.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 1, Sample01.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(1 * 1, Sample01.squared());
    }
}
