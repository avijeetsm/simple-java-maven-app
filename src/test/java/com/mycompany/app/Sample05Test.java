package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample05Test {

    @Test
    void idReturnsConstant() {
        assertEquals(5, Sample05.id());
    }

    @Test
    void doubledIsTwiceId() {
        assertEquals(2 * 5, Sample05.doubled());
    }

    @Test
    void tripledIsThreeTimesId() {
        assertEquals(3 * 5, Sample05.tripled());
    }

    @Test
    void squaredIsIdTimesId() {
        assertEquals(5 * 5, Sample05.squared());
    }
}
