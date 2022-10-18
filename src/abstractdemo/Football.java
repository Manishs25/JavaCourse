package abstractdemo;

public class Football extends Sports1{

    @Override
    public void play() {
        System.out.println("Playing football");
    }

    public static void main(String[] args) {
        Football obj =new Football();
        obj.play();

        obj.exercise();

        Hockey obj1 =new Hockey();
        obj1.show();

    }
}

class Hockey extends Football{
    public void show(){
        System.out.println("Playing Hockey");
    }
}

class Cricket extends Sports1{

    @Override
    public void play() {
        System.out.println("Playing Cricket");
    }

    public static void main(String[] args) {
        Cricket obj = new Cricket();
        obj.play();
    }
}