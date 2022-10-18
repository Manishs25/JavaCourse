package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) {
        try {
            File file = new File("E:/CodekulJava/src/filehandling/sample.txt");
            if (file.exists()) {
                System.out.println("File already exists");
            } else {
                file.createNewFile();

            }
            System.out.println(file.getAbsolutePath());
            System.out.println(file.canExecute());
            System.out.println(file.getCanonicalFile());
            System.out.println(file.getPath());
            System.out.println(file.setReadOnly());
            System.out.println(file.getTotalSpace());
            System.out.println(file.getParent());
            System.out.println(file.getTotalSpace());
            System.out.println(file.isDirectory());
            System.out.println(file.isHidden());
            System.out.println(file.length());

            File file2 = new File("testing");
            file2.mkdir();

            File file3 = new File("testing/testDemo.txt");
            file3.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
