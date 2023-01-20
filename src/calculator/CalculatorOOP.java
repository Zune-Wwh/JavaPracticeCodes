package calculator;

import java.util.Scanner;

class Operations {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void sub(int a, int b) {
        System.out.println(a - b);
    }

    void mul(int a, int b) {
        System.out.println(a * b);
    }

    void div(int a, int b) {
        System.out.println(a / b);
    }
}

public class CalculatorOOP extends Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the 1 digit: ");
            int firstDigit = scanner.nextInt();

            System.out.print("Enter the 2 digit: ");
            int secondDigit = scanner.nextInt();

            System.out.print("Choose operator: ");
            String operator = scanner.next();

            Operations obj = new Operations();

            if (operator.equals("+")) {
                obj.add(firstDigit, secondDigit);
            } else if (operator.equals("-")) {
                obj.sub(firstDigit, secondDigit);
            } else if (operator.equals("*")) {
                obj.mul(firstDigit, secondDigit);
            } else if (operator.equals("/")) {
                obj.div(firstDigit, secondDigit);
            }

        }
    }
}
