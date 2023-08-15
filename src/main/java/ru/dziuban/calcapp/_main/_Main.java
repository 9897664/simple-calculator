package ru.dziuban.calcapp._main;

import ru.dziuban.calcapp.service.ResultWriterService;
import ru.dziuban.calcapp.util.Calculator;

public class _Main {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int result = Calculator.sum(a, b);
        ResultWriterService.printResult(a, b, result, "сумма", "+");
        result = Calculator.subtraction(a, b);
        ResultWriterService.printResult(a, b, result, "разность", "-");
        result = Calculator.multiply(a, b);
        ResultWriterService.printResult(a, b, result, "произведение", "*");
    }
}

