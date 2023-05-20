package com.example.calculator.service;

import com.example.calculator.exception.DivByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public Integer plus(int a, int b) {
        return (a + b);
    }

    public Integer minus(int a, int b) {
        return (a - b);
    }

    public Integer com(int a, int b) {
        return (a * b);
    }

    public Double divide(double a, double b) {
        if (b == 0) {
            throw new DivByZeroException();
        }
        return (a / b);
    }
}
