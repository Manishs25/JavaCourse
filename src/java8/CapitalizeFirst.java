package java8;

interface MyInterface6 {
    String capital(String str);
}

public class CapitalizeFirst {
    public static void main(String[] args) {
        MyInterface6 m = CapitalizeFirst::firstLetterCaps;
        System.out.println(m.capital("maharashtra"));
    }

    private static String firstLetterCaps(String str) {
        return str.replaceFirst(str.substring(0, 1), String.valueOf(str.charAt(0)).toUpperCase());
    }
}
