package billpackage;

import java.util.Scanner;

abstract class Features {
    abstract void checkBalance(int balance);

    abstract void purchasePackage(int choice, int balance);

    abstract void showPackage();
}

public class BillPackageOOP extends Features {
    @Override
    void checkBalance(int balance) {
        System.out.println("Your remaining balance is " + balance + " kyats.");
        System.out.println();
    }

    @Override
    void purchasePackage(int choice, int balance) {
        if (choice == 1) {
            balance += 1000;
            System.out.println("Congratulations! You have top up with 1000Ks.");
            System.out.println("Your remaining balance is " + balance + " kyats.");
            System.out.println();
        } else if (choice == 2) {
            balance += 3000;
            System.out.println("Congratulations! You have top up with 3000Ks.");
            System.out.println("Your remaining balance is " + balance + " kyats.");
            System.out.println();
        } else if (choice == 3) {
            balance += 5000;
            System.out.println("Congratulations! You have top up with 5000Ks.");
            System.out.println("Your remaining balance is " + balance + " kyats.");
            System.out.println();
        } else if (choice == 4) {
            balance += 10000;
            System.out.println("Congratulations! You have top up with 10000Ks.");
            System.out.println("Your remaining balance is " + balance + " kyats.");
            System.out.println();
        }else{
            System.out.println("There is no package for "+ choice);
        }

    }

    @Override
    void showPackage() {
        System.out.println("1.1000Ks");
        System.out.println("2.3000Ks");
        System.out.println("3.5000Ks");
        System.out.println("4.10000Ks");
    }

    public static void main(String[] args) {
        int remainingBalance = 99;
        BillPackageOOP obj = new BillPackageOOP();
        while (true) {
            System.out.println("Enter *124# to check your balance.");
            System.out.println("Enter *979*2*2# to top-up your balance.");
            Scanner scanner = new Scanner(System.in);
            String checkBalance = scanner.next();
            switch (checkBalance) {
                case "*124#":
                    obj.checkBalance(remainingBalance);
                    break;
                case "*979*2*2#":
                    obj.showPackage();
                    System.out.print("Choose your package: ");
                    int input = scanner.nextInt();
                    obj.purchasePackage(input, remainingBalance);
                    break;
                default:
                    System.out.println("Please enter a valid code!");
            }

        }
    }
}
