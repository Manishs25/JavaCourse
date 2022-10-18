package basic;

public class PSVMDemo {
    int i = 10;

    public  String show(int i) {
        System.out.println("in show method" + i);
        return "new Datatypes()";
    }
//appystack@9876
    public static void main(int[] args) {

    }

    static public void main(String[] args) {
        /**
         *
         * public => is access modifier and jvm can access from outside.
         * static => without creating object of class jvm can access this method.
         * void => it return nothing.
         * main => main is identifier and entry point of java program
         * String[] => it is command line arguments
         * args => variable name
         */

        PSVMDemo obj = new PSVMDemo();

//        String str = obj.show(2);
//        System.out.println(str);
        System.out.println(args[0]);
        System.out.println(args[1]);
//         System.out.println(obj.i);
//         show(3);

    }
}
