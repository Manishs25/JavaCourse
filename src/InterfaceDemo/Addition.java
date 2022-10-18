package InterfaceDemo;

public class Addition implements Add,Sub {

    @Override
    public int Add(int i, int j) {//implementation of method
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i/j);
        System.out.println(i%j);
        return 0;
    }

    @Override
    public int Sub(int i, int j) {
        System.out.println(i-j);
        return 0;
    }


    public static void main(String[] args) {
    Addition obj = new Addition();
    obj.Add(4,6);
    obj.Sub(6,3);
}

}
