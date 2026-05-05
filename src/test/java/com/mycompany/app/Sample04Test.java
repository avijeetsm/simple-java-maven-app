package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample04Test {

    @Test
    void idReturnsConstant() {
        assertEquals(4, Sample04.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 4, Sample04.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 4, Sample04.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(4 * 4, Sample04.squared());
    }
}
