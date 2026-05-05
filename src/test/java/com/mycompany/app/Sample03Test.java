package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample03Test {

    @Test
    void idReturnsConstant() {
        assertEquals(3, Sample03.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 3, Sample03.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 3, Sample03.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(3 * 3, Sample03.squared());
    }
}
