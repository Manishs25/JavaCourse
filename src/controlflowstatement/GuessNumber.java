package controlflowstatement;

import java.awt.*;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int num = (int) (Math.random() * 100) + 1;

        int guessNumber;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the number : ");
            guessNumber = sc.nextInt();

            if (num > guessNumber) {
                System.out.println("Number is greater");
            } else if (num < guessNumber) {
                System.out.println("Number is less");
            } else {
                System.out.println("You guess Correct!!!");
            }

        }
            while (num != guessNumber) ;
    }
}
