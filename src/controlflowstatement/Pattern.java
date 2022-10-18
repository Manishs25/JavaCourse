package controlflowstatement;

public class Pattern {
    public static void main(String[] args) {

        // <<--triangle pattern -->>

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.println("*");
//            }
//            System.out.println();

            // -->> reverse pattern <<--

//            for (int i = 1; i <= 4; i++) {
//                for (int j = 4; j >= i; j--) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

            // -->> pyramid pattern

            for (int i = 1; i <= 5; i++) {
                for (int j = 5; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print( i+" " );
                }
            System.out.println();
            }
        }
    }





