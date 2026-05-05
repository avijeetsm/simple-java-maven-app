package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample10Test {

    @Test
    void idReturnsConstant() {
        assertEquals(10, Sample10.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 10, Sample10.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 10, Sample10.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(10 * 10, Sample10.squared());
    }
}
