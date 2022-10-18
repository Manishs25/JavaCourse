package finaldemo;

/**
 * final keyword -
 *               1. to declare a constant
 *                  or if you declare final variable you can not change value
 *               2. if you declare final method then you can not override the method .
 *               3. if you declare final class then you can not inherit the class
 */

public final class FinalDemo {

    final Integer i = 10;

    public final void show(){
//        i = 20;
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.show();
        System.out.println(obj.i);
    }
}

//class Sample2 extends FinalDemo{
//
////    @Override
////    public void show() {
////        super.show();
////    }
//}
