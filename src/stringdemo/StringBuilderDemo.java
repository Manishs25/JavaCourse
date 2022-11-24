package stringdemo;

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("@Manish");

        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());
        stringBuilder.append("_X");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.indexOf("s"));
//        System.out.println(stringBuilder.delete(0,4));
//        System.out.println(stringBuilder.deleteCharAt(4));
        System.out.println(stringBuilder.lastIndexOf("r"));
        System.out.println(stringBuilder.isEmpty());
        System.out.println(stringBuilder.capacity());
//        System.out.println(stringBuilder.insert(4,'S'));
//        stringBuilder.setCharAt(4,'X');
        System.out.println(stringBuilder);
    }
}
