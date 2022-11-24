package stringdemo;

public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Pune");
        StringBuffer sb1 = new StringBuffer("Pune");

//      sb.append("Hii!!!");
//      System.out.println(sb.append(sb1));
//      System.out.println(sb.reverse());
        System.out.println(sb.replace(0, 4, "Satara"));
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(1));
//      System.out.println(sb.delete(1,3));
//      System.out.println(sb.deleteCharAt(3));
        sb.setCharAt(1, 'I');
        sb.insert(1, 'P');

    }

}
