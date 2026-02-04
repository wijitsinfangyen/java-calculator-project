package main;

import calculation.Calculator;
import input.InputHandler;

public class Main {
    public static void main(String[] args) {

        InputHandler input = new InputHandler();
        Calculator calculator = new Calculator();

        double a = input.getNumber();
        double b = input.getNumber();
        String op = input.getOperator();

        double result = 0;

        switch (op) {
            case "+":
                result = calculator.add(a, b);
                break;
            case "-":
                result = calculator.subtract(a, b);
                break;
            case "*":
                result = calculator.multiply(a, b);
                break;
            case "/":
                result = calculator.divide(a, b);
                break;
            case "%":
                result = calculator.percent(a);
                break;
            default:
                System.out.println("ตัวดำเนินการไม่ถูกต้อง");
                return;
        }

        System.out.println("ผลลัพธ์ = " + result);
    }
}