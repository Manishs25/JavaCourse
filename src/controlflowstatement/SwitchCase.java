package controlflowstatement;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date : ");
        int day = sc.nextInt();
        String nextNumber;

    switch(day){
        case 1,8,15,22,29:
            System.out.println("Sunday");

            System.out.println("Enter another String :");
            nextNumber = sc.next();
            switch (nextNumber){
                case "one" :
                    System.out.println("1");
                    break;
                case "Two" :
                    System.out.println("2");

            }
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        default:
            System.out.println("Wrong Choice");


    }
}

}
//array reverse
//duplicate
//even and odd
//default case mdhe array list