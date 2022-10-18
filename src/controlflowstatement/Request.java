package controlflowstatement;

import java.util.Scanner;

public class Request {
    public static void main(String[] args) {
        int num1,sum=0;
        char choice;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter the second number :");
            num1= sc.nextInt();
            sum=sum+num1;

            System.out.print("Do you want to continue :");
            choice=sc.next().charAt(0);
        }while(choice == 'Y' || choice =='y' );
        System.out.println(sum);

    }


}
