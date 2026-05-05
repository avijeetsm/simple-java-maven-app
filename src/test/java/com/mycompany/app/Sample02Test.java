package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample02Test {

    @Test
    void idReturnsConstant() {
        assertEquals(2, Sample02.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 2, Sample02.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 2, Sample02.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(2 * 2, Sample02.squared());
    }
}
