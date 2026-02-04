package input;

import java.util.Scanner;

public class InputHandler {

    private Scanner scanner = new Scanner(System.in);

    public double getNumber() {
        System.out.print("กรอกตัวเลข: ");
        return scanner.nextDouble();
    }

    public String getOperator() {
        System.out.print("กรอกตัวดำเนินการ (+ - * / %): ");
        return scanner.next();
    }
}
