package com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class TestJUnit {

    @Test
    public void testMethod() {
        Assertions.assertEquals(10, 2 + 8);
    }

    @ParameterizedTest
    @ValueSource(ints = {-4, -3, -2, -1, 0, 1, 2, 3, 4, 5})
    public void testMethod2(int num) {
        Assertions.assertTrue(num > 0);
    }

    @ParameterizedTest
    @MethodSource("stringComparator")
    public void testMethod3(String str1, String str2) {
        Assertions.assertEquals(str1, str2);
    }
    
    static Stream<Arguments> stringComparator() {
        return Stream.of(
                Arguments.arguments("themode", "themode")
        );
    }
}
