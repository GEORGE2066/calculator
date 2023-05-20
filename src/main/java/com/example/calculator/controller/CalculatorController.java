package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) int a,
                       @RequestParam(value = "num1", required = false) int b) {
        return a + " + " + b + " = " + calculatorService.plus(a, b);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) int a,
                        @RequestParam(value = "num1", required = false) int b) {
        return a + " - " + b + " = " + calculatorService.minus(a, b);
    }

    @GetMapping(path = "/compozition")
    public String multiply(@RequestParam(value = "num1", required = false) int a,
                        @RequestParam(value = "num1", required = false) int b) {
        return a + " * " + b + " = " + calculatorService.com(a, b);
    }

    @GetMapping(path = "/divide")
    public String pluse(@RequestParam(value = "num1", required = false) double a,
                        @RequestParam(value = "num1", required = false) double b) {
        return a + " / " + b + " = " + calculatorService.divide(a, b);
    }
}
