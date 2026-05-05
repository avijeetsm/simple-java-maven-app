package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample21Test {

    @Test
    void idReturnsConstant() {
        assertEquals(21, Sample21.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 21, Sample21.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 21, Sample21.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(21 * 21, Sample21.squared());
    }
}
