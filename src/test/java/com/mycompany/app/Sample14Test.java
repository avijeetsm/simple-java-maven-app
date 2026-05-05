package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample14Test {

    @Test
    void idReturnsConstant() {
        assertEquals(14, Sample14.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 14, Sample14.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 14, Sample14.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(14 * 14, Sample14.squared());
    }
}
