package staticdemo;

public class StaticKeyword {

    int id;

    String name;

    static String companyName;

    static {
        companyName ="ABC";
        System.out.println("In static block");
    }

    public StaticKeyword(int id, String name) {
        this.id = id;
        this.name = name;

    }


    public StaticKeyword() {
    }

    static class Inner{
        static int id = 10;

        String name  = "Vishal";

        public static void display(){
            System.out.println("In static inner");
        }
    }


    public static void show(){
        System.out.println("static method");
    }

    public static void main(String[] args) {

//        StaticKeyword obj1 = new StaticKeyword(1,"Prakash");
//        StaticKeyword obj2 = new StaticKeyword(2,"Rajendra");
//        StaticKeyword obj3 = new StaticKeyword(3,"Akash");
//
//        System.out.println(obj1.id+" "+obj1.name+" "+companyName);
//        System.out.println(obj2.id+" "+obj2.name+" "+companyName);
//        System.out.println(obj3.id+" "+obj3.name+" "+companyName);

//        show();

        StaticKeyword obj = new StaticKeyword();

//        StaticKeyword.Inner obj1 = obj.new Inner();
//        System.out.println(obj1.id);

        Inner.display();
    }
}