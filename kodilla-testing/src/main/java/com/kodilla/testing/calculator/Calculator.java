package com.kodilla.testing.calculator;

public class Calculator {


public int addDigits (int a, int b) {

    return a + b; }

public int substractDigits (int a, int b) {
    return a - b; }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultA = calculator.addDigits(1, 17);
        int resultS = calculator.substractDigits(64, 56);
        System.out.println(resultA);
        System.out.println(resultS);

    }
}