package com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJUnit {
    @Test
    static void testMethod(){
        Assertions.assertEquals(10, 2+8);
    }
}
