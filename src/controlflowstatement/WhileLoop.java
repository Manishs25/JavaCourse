package controlflowstatement;

public class WhileLoop {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }


        i=1;

        while(i<=10){
            i=i+2;
            System.out.println(i);
            System.out.println(i);
            System.out.println(i);
            System.out.println(i);
            System.out.println(i);
            System.out.println(i);

        }

        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}