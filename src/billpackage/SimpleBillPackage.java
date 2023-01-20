package billpackage;

import java.util.Scanner;

public class SimpleBillPackage {
    public static void main(String[] args) {
        int remainingBalance = 99;
 while(true){
        System.out.println("Enter *124# to check your balance.");
        System.out.println("Enter *979*2*2# to top-up your balance.");
        Scanner scanner = new Scanner(System.in);
        String checkBalance = scanner.next();
        if (checkBalance.equals("*124#")) {
            System.out.println("Your remaining balance is " + remainingBalance + " kyats.");
            System.out.println();
        } else if (checkBalance.equals("*979*2*2#")) {
            System.out.println("1.1000Ks");
            System.out.println("2.3000Ks");
            System.out.println("3.5000Ks");
            System.out.println("4.10000Ks");
            System.out.print("Choose your package: ");
            int topUpChoice = scanner.nextInt();
            if (topUpChoice == 1) {
                remainingBalance += 1000;
                System.out.println("Congratulations! You have top up with 1000Ks.");
                System.out.println("Your remaining balance is " + remainingBalance + " kyats.");
                System.out.println();
            } else if (topUpChoice == 2) {
                remainingBalance += 3000;
                System.out.println("Congratulations! You have top up with 3000Ks.");
                System.out.println("Your remaining balance is " + remainingBalance + " kyats.");
                System.out.println();
            } else if (topUpChoice == 3) {
                remainingBalance += 5000;
                System.out.println("Congratulations! You have top up with 5000Ks.");
                System.out.println("Your remaining balance is " + remainingBalance + " kyats.");
                System.out.println();
            } else if (topUpChoice == 4) {
                remainingBalance += 10000;
                System.out.println("Congratulations! You have top up with 10000Ks.");
                System.out.println("Your remaining balance is " + remainingBalance + " kyats.");
                System.out.println();
            }
        } else {
            System.out.println("Please enter a valid code!");
        }
    }

    }
}
