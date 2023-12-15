package com.scientificalculator.scientificcalculatorservice;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public double square(double num) {
        return Math.pow(num, 2);
    }

    public double sin(double angleInRadians) {
        return Math.sin(angleInRadians);
    }

    public double cos(double angleInRadians) {
        return Math.cos(angleInRadians);
    }

    public double tan(double angleInRadians) {
        return Math.tan(angleInRadians);
    }
}
