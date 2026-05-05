package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample18Test {

    @Test
    void idReturnsConstant() {
        assertEquals(18, Sample18.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 18, Sample18.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 18, Sample18.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(18 * 18, Sample18.squared());
    }
}
