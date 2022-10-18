package polymorphism;

/** method overriding - if two classes have same method with same signature
 *  advantage -> you are implementing parent class method in child
 */
public class Animal {

    public void sound(){
        System.out.println("Animal sound");
    }
}

class Cat extends Animal{

    public void sound(){
        System.out.println("cat sound");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
    }
}
