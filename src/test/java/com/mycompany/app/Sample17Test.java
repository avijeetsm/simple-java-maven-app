package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample17Test {

    @Test
    void idReturnsConstant() {
        assertEquals(17, Sample17.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 17, Sample17.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 17, Sample17.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(17 * 17, Sample17.squared());
    }
}
