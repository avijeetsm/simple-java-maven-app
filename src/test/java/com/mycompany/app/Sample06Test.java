package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample06Test {

    @Test
    void idReturnsConstant() {
        assertEquals(6, Sample06.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 6, Sample06.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 6, Sample06.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(6 * 6, Sample06.squared());
    }
}
