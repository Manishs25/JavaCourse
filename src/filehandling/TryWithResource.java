package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//ctrl+alt+shift+j : multiple cursors
public class TryWithResource {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("E:/CodekulJava/src/filehandling/sample.txt")) {
            fileWriter.write("Lets do Some filewrtier thing");
            System.out.println("File write successfully");
        } catch (IOException e) {
            System.out.println(e);
        }
        try (FileReader fileReader = new FileReader("E:/CodekulJava/src/filehandling/sample.txt")) {
            for (int i = fileReader.read(); i >= 0; ) {
                System.out.print((char) i);
                i = fileReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}


