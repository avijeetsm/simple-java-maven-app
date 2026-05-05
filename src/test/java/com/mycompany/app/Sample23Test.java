package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample23Test {

    @Test
    void idReturnsConstant() {
        assertEquals(23, Sample23.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 23, Sample23.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 23, Sample23.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(23 * 23, Sample23.squared());
    }
}
