package ru.dziuban.calcapp.service;

import ru.dziuban.calcapp._main._Main;
import ru.dziuban.calcapp.util.Calculator;

public class ResultWriterService {

    public static void printResult(int x, int y, int customResult, String operationName, String operationSign) {
        System.out.println(operationName + ": " + x + " " + operationSign + " " + y + " = " + customResult);
    }
}
