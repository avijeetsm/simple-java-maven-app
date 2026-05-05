package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample22Test {

    @Test
    void idReturnsConstant() {
        assertEquals(22, Sample22.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 22, Sample22.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 22, Sample22.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(22 * 22, Sample22.squared());
    }
}
