package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void test() {
        var test = Main.test();
        assertEquals(test , "test");
    }

}
