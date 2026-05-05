package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample20Test {

    @Test
    void idReturnsConstant() {
        assertEquals(20, Sample20.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 20, Sample20.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 20, Sample20.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(20 * 20, Sample20.squared());
    }
}
