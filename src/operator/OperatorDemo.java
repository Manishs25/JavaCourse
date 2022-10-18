package operator;

/**
 * unary operator -> a++,++a,a--,--a
 * assignment -> = ,==
 * relational -> <,>, <=,>=
 * shift -> << ,>>
 * arithmetic ->  + ,- ,/ ,*,%
 * logical ->  &&,|| NOT
 * bitwise -> & ,|
 * ternary -> ? :
 */
public class OperatorDemo {
    public static void main(String[] args) {

        int i=15;
        int j=8;
//        System.out.println(i++); //i = i + 1 //10
//        System.out.println(++i);//i+1 = i //12
//
//        System.out.println(i--);//i=i-1 //12
//        System.out.println(--i);//i-1=i //10

//        System.out.println(i<<4); //10*2^3 =40
//        System.out.println(i>>2); //10/2^2 = 2.5

//        System.out.println(i+j);//14
//        System.out.println(i-j);//6
//        System.out.println(i/j);//2
//        System.out.println(i*j);//40
//        System.out.println(i%j);//2

        System.out.println(i&j);
        System.out.println(i|j);

    }
}