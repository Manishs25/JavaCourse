package exceptionhandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;  // op: infinity
        int k = 0;
        try {

            try {
                k = i / j;
                String str = null; //nullpointerexception
                System.out.println(str.toUpperCase());
            } catch (NullPointerException e) {
                System.out.println("Null pointer ==>" + e);
            }
            System.out.println("In try catch block");  // will jump from this block and goes to second statemen
        }

//        catch(RuntimeException m{  //if you don't know expection type and RuntimeException(unchecked) vice versa
        //refer to hierarchy of exception handling  ===>>> if exception found in upper catch block this catch block will never execute
        catch (NumberFormatException m) { //cant handle exception
            System.out.println(m);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e1) {
            System.out.println(e1);
        }finally {
            System.out.println("in finally");
        }
            System.out.println(k);
            System.out.println("hiii");
        }
    }





