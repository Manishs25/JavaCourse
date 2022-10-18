package operator;

public class UpDownCasting {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.show();

        Child child = new Child();
        child.show();
        child.display();

        Parent parent1 = new Child();//upcasting
        parent1.show();

        Child obj = (Child) parent1;//down casting
        obj.show();
        obj.display();

    }
}

class Parent{

    public void show(){
        System.out.println("in Parent");
    }
}

class Child extends Parent{

    public void display(){
        System.out.println("in child");
    }
}
