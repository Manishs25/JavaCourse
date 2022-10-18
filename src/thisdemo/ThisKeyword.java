package thisdemo;

/**
 *
 *
 * this -
 *       1. this keyword used to refer current class instance variable
 *       2. this is used to invoke current class methods.
 *       3. this is used to invoke current class constructor.
 */
public class ThisKeyword {

    //global variable,instance variable
    int id;
    String name;
    String address;


    public void show(){
        System.out.println("In show");
    }

    public void display(){
        this.show();
    }
    public ThisKeyword(int id,String name,String address){//local variable
        this.id = id;
        this.name = name;
        this.address = address;
        this.show();
    }

    public ThisKeyword(){
        this(2,"Ravi","Mumbai");
    }

    public static void main(String[] args) {
//        ThisKeyword obj = new ThisKeyword(1,"Akash","Pune");

//        System.out.println(obj.id+" "+ obj.name+" "+obj.address);

        ThisKeyword obj = new ThisKeyword();
    }
}
