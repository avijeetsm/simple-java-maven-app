package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample11Test {

    @Test
    void idReturnsConstant() {
        assertEquals(11, Sample11.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 11, Sample11.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 11, Sample11.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(11 * 11, Sample11.squared());
    }
}
