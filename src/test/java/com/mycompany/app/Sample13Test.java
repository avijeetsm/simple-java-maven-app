package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample13Test {

    @Test
    void idReturnsConstant() {
        assertEquals(13, Sample13.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 13, Sample13.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 13, Sample13.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(13 * 13, Sample13.squared());
    }
}
