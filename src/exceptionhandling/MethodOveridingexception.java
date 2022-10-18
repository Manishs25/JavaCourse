package exceptionhandling;

public class MethodOveridingexception {

    public  void display()
    {
        System.out.println("In display");

    }

    public static void main(String[] args) {

    }
}

class MethodOverriding extends MethodOveridingexception{
    @Override
    public void display() {
        System.out.println("in display MethodOverriding");
    }
}

//if parent class declare no exception then you can declare only unchecked exception
//if parent class declare exception then you can declare same exception
//if parent class declare exception then you can declare child exception
