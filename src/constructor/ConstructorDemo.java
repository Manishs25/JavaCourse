package constructor;

/**
 * Constructor -> is special type of function which invoke automatically when
 *                we create object of class
 *
 * Rules -> 1. class name and function name should be same
 *          2. there is no return type to constructor
 *          3. we can not declare Constructor as abstract,final,static, synchronized
 *
 * types -> 1. default
 *          2. parameter Constructor
 *
 * use -> it initialise variables to their default values
 *
 */
public class ConstructorDemo {

    public ConstructorDemo(){
        System.out.println("In Constructor");
    }

    public ConstructorDemo(int i){
        System.out.println("In Parameter const "+ i);
    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();

        ConstructorDemo obj1 = new ConstructorDemo(2);

    }
}