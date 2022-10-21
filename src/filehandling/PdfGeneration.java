package filehandling;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PdfGeneration {
    public static void main(String[] args) {

        try {

            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("src/filehandling/text.pdf"));

            //open
            document.open();

            Paragraph p = new Paragraph("This is right aligned text");
            // p.add("This is my paragraph 1");
            p.setAlignment(Element.ALIGN_CENTER);

            document.add(p);
            document.close();


        } catch (DocumentException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
