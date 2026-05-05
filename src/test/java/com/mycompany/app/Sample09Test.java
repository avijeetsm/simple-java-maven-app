package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample09Test {

    @Test
    void idReturnsConstant() {
        assertEquals(9, Sample09.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 9, Sample09.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 9, Sample09.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(9 * 9, Sample09.squared());
    }
}
