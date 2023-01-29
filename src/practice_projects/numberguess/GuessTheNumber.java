package practice_projects.numberguess;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(101);
        //System.out.println(answer);
        int count =0;

        while(true){
            System.out.print("Please enter a number between 1 and 100: ");
            Scanner scanner = new Scanner(System.in);
            int input= scanner.nextInt();


            if(input>answer){
                count++;
                System.out.println("Incorrect. Please try again with a smaller number.");
            } else if (input<answer) {
                count++;
                System.out.println("Incorrect. Please try again with a bigger number.");
            }else if(input == answer){
                if(count <5){
                    System.out.println("Congratulations! You have guessed "+ count+ " times. You are a genius");
                    break;
                }else if(count <10){
                    System.out.println("Congratulations! You have guessed "+ count+ " times. Good.");
                    break;
                }else if(count <15){
                    System.out.println("Congratulations! You have guessed "+ count+ " times. Not bad");

                }else{
                    System.out.println("Congratulations! You have guessed "+ count+ " times. Too bad, you have guessed more than 15 times.");
                }

            }
        }


    }
}
