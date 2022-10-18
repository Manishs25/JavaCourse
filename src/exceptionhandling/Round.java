package exceptionhandling;
//import  Math.java.lang;

public class Round {
    public static void main(String[] args) {

        double i=314;

        double d = i%100;

        if(d<=25){
            System.out.println(fl(i));
        }else if(d>25&&d<=50){
            System.out.println(cl(i));
        } else if (d>50&&d<=74) {
            System.out.println(fl(i));
        }else if (d>=75){
            System.out.println(cl(i));
        }
    }

    private static double fl (double i){
        return 50* (Math.floor(Math.abs(i/50)));
    }
    private static double cl(double i){
        return  50* (Math.ceil(Math.abs(i/50)));
    }
}
