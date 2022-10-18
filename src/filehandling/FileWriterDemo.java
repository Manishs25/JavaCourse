package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {


    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("E:/CodekulJava/src/filehandling/sample.txt");
            fileWriter.write("Lets do Some filewrtier thing");
            System.out.println("File write successfully");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        FileReader fileReader = null;

        try{
            fileReader = new FileReader("E:/CodekulJava/src/filehandling/sample.txt");
            for(int i= fileReader.read();i>=0;){
                System.out.print((char)i);
                i=fileReader.read();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }finally {
            try{
                fileReader.close();
            }catch (IOException e){
                throw  new RuntimeException();
            }
        }

    }
}
