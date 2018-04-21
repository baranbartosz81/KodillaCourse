package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultA = calculator.addDigits(1, 17);
        int resultS = calculator.substractDigits(64, 56);

        if (resultA == 18) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }
        if (resultS == 7) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }
    }
}

