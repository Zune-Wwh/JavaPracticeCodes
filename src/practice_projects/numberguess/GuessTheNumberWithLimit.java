package practice_projects.numberguess;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberWithLimit {
    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(100);
        System.out.println(answer);
        int count = 5;


        while (count >= 1) {
            System.out.print("Please enter a number between 1 and 100: ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input < answer) {
                count--;
                if (count == 0) {
                    System.out.println("Game Over!");
                    break;
                } else {
                    System.out.println("Incorrect. Please try again with a greater number.");
                    System.out.println("You now have " + count + " lives left.");
                }
            } else if (input > answer) {
                count--;
                if (count == 0) {
                    System.out.println("Game Over!");
                    break;
                } else {
                    System.out.println("Incorrect. Please try again with a smaller number.");
                    System.out.println("You now have " + count + " lives left.");
                }
            } else if (input == answer) {
                System.out.println("Congratulation! You have gueessd the word.");
                break;
            }
        }


    }
}
