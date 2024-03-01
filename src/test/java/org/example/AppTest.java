package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void addMeTest() {
        assertEquals(5, App.addMe(2, 3));
    }

}