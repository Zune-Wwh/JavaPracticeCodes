package calculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.print("Enter the first digit: ");
            int firstDigit = scanner.nextInt();
            System.out.print("Enter the second digit: ");
            int secondDigit = scanner.nextInt();
            System.out.print("Enter the operator: ");
            String operator = scanner.next();


            switch (operator) {
                case "+":
                    System.out.println(firstDigit + secondDigit);
                    break;
                case "-":
                    System.out.println(firstDigit - secondDigit);
                    break;
                case "*":
                    System.out.println(firstDigit * secondDigit);
                    break;
                case "/":
                    System.out.println(firstDigit / secondDigit);
                    break;
                default:
                    System.out.println("Please enter a valid operator.");
            }
        }

    }
}
