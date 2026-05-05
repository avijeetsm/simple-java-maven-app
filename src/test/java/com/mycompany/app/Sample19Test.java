package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample19Test {

    @Test
    void idReturnsConstant() {
        assertEquals(19, Sample19.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 19, Sample19.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 19, Sample19.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(19 * 19, Sample19.squared());
    }
}
