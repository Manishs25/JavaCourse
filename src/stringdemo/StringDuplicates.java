package stringdemo;

public class StringDuplicates {
    public static void main(String[] args) {

        String str = "Satara ";
        char[] str2 = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str2[i] == str2[j]) {
                    System.out.print(str2[j]+" ");
                }
            }
        }
    }
}
