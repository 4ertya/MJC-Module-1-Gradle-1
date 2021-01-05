package by.mjc.palchynski;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @ParameterizedTest
    @MethodSource("dataForIsPositiveNumberCorrectTest")
    void isPositiveNumberCorrect(String str) {
        boolean actual = StringUtils.isPositiveNumber(str);
        assertTrue(actual);
    }

    @ParameterizedTest
    @MethodSource("dataForIsPositiveNumberIncorrectTest")
    void isPositiveNumberIncorrect(String str) {
        boolean actual = StringUtils.isPositiveNumber(str);
        assertFalse(actual);
    }

    private static Stream<Arguments> dataForIsPositiveNumberCorrectTest() {
        return Stream.of(
                Arguments.of("123"),
                Arguments.of("12"),
                Arguments.of("3"),
                Arguments.of("17"));
    }

    private static Stream<Arguments> dataForIsPositiveNumberIncorrectTest() {
        return Stream.of(
                Arguments.of("  123"),
                Arguments.of("12.2 3"),
                Arguments.of("-17,3"),
                Arguments.of("-17"),
                Arguments.of("-17.3"),
                Arguments.of("17a"));
    }
}