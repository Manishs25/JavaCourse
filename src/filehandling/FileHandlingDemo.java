package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {
        File file = new File("Readme.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String str = "Welcome to readme!!";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("file write successfully!!");
        } catch (IOException f) {
            System.out.println(f);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);

//        int i = fileInputStream.read();
            for (int i = fileInputStream.read(); i >= 0; ) {
                System.out.print((char) i);
                i = fileInputStream.read();
            }
//        while (i>0){
//            System.out.print((char)i);
//            i = fileInputStream.read();
//        }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
