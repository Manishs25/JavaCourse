package exceptionhandling;
//to break your program 'throw' keyword is used||

/*
 *
 *            throw                                                              throws
 * 1. to throw the exception explicitly                              1. to declare exception
 *
 * 2. throw is used in method                                        2. throws is used with method signature
 *
 * 3. throw is followed by instance                                  3. throws followed by classes
 *
 * 4. You can only throw single exception                            4. You can declare multiple exception
 */

public class ThrowKeyword {
    public static void main(String[] args) throws Exception{

        int age = 17;

        if(age>18){
        System.out.println("Eligible for voting!!!");
    }else {
            throw new Exception("You're not eligible for voting!!!");
        }

}

//        using try catch
//        if (age>18){
//            System.out.println("vote");
//        }else {
//            try{
//                throw new Exception("you Cant");
//            }catch (Exception e){
//                System.out.println(e);
//            }
//        }
}
