package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample08Test {

    @Test
    void idReturnsConstant() {
        assertEquals(8, Sample08.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 8, Sample08.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 8, Sample08.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(8 * 8, Sample08.squared());
    }
}
