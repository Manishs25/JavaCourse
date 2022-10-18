package operator;

interface MyInterface{

}

public class MarkerDemo implements MyInterface{

    public void add(){
        System.out.println("in add method");
    }

    public static void main(String[] args) {
        MarkerDemo obj = new MarkerDemo();
        if(obj instanceof MyInterface){
            obj.add();
        }
    }

}
