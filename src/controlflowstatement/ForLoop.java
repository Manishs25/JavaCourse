package controlflowstatement;

import java.util.Arrays;
import java.util.List;

public class ForLoop {
    public static void main(String[] args) {
//        int[] arr = new int[4];
//
//        arr[0]=10;
//        arr[1]=20;
//        arr[2]=30;
//        arr[3]=40;

//
//        System.out.println(arr[3]);
//        System.out.println(arr[2]);
//        System.out.println(arr[1]);
//        System.out.println(arr[0]);


//        for(int i=0;i<arr.length;i++){  //i=i+1
//            System.out.println(arr[i]);
//        }

        //traditional for loop *********
//
//        for(int i =arr.length-1;i>=0;i--){
//            System.out.println(arr[i]);
//        }

        // even odd array

//        for(int i=0;i<arr.length;i++){  //i=i+1
//            if(arr[i]%2==0){
//                System.out.println(arr[i]+"Even No.");
//            }else{
//                System.out.println(arr[i]+"Odd No.");
//            }
//        }


//        //enhanced for loop ********
//        for (int i: arr) {
//            System.out.println(i);
//        }
//
//        List<Integer> list = Arrays.asList(1,2,3,4,5);

//        list.forEach(s->{
//            System.out.println(s);
//        });

//        list.forEach(System.out::println);

//        Arrays.asList(1,2,3,4,5).forEach(System.out::println);

//        for(int i=1;i<=4;i++) {
//            for (int j = 1; j <= 4; j++) {
//                System.out.print("*");
//
//            }
//        System.out.println();
//        }

//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=4;j++){
//                if((i==2 && j==2) || (i==2 && j==3) || (i==3 && j==2) || (i==3 && j==3)){
//                    System.out.print("  ");
//                }else{
//                    System.out.print(" *");
//                }
//            }
//                System.out.println();
//        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}