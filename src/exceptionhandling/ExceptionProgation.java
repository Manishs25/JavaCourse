package exceptionhandling;

public class ExceptionProgation {
    public void a(){
        int a=10/0;
    }

    public void b(){
        this.a();
    }
    public void c(){
        try {
            this.b();
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
//        System.out.println("no exception");
        ExceptionProgation obj = new ExceptionProgation();
        obj.c();
    }
}
