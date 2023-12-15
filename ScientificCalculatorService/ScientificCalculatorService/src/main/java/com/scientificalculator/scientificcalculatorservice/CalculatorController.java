package com.scientificalculator.scientificcalculatorservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String showCalculator() {
        return "calculator";
    }
}
