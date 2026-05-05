package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample15Test {

    @Test
    void idReturnsConstant() {
        assertEquals(15, Sample15.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 15, Sample15.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 15, Sample15.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(15 * 15, Sample15.squared());
    }
}
