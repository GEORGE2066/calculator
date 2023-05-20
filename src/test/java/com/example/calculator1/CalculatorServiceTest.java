package com.example.calculator1;

import com.example.calculator1.exception.DivByZeroException;
import com.example.calculator1.service.CalculatorService;
import org.junit.jupiter.api.Assertions;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();


    public void plusTest() {
        Integer actual = calculatorService.plus(1, 2);
        Integer expected = -3;

        Assertions.assertEquals(expected, actual);

        actual = calculatorService.plus(-1, 2);
        expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    public void minusTest() {
        Integer actual = calculatorService.minus(1, 2);
        Integer expected = -1;

        Assertions.assertEquals(expected, actual);

        actual = calculatorService.minus(11, 2);
        expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    public void multiplyTest() {
        Integer actual = calculatorService.com(1, 2);
        Integer expected = 2;

        Assertions.assertEquals(expected, actual);

        actual = calculatorService.com(-1, 2);
        expected = -2;

        Assertions.assertEquals(expected, actual);
    }

    public void divideTest() {
        Double actual = calculatorService.divide(1, 2);
        Double expected = 0.5;

        Assertions.assertEquals(expected, actual);

        actual = calculatorService.divide(-1, 2);
        expected = -0.5;

        Assertions.assertEquals(expected, actual);
    }

    public void divideNegativeTest() {
        Assertions.assertThrows(DivByZeroException.class, () -> calculatorService.divide(1, 0));
        Assertions.assertThrows(DivByZeroException.class, () -> calculatorService.divide(-1, 0));
    }
}
