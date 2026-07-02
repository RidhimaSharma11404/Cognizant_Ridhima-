// Concrete class for PDF Document
public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("[PDF]  Opening PDF Document (.pdf)...");
    }

    @Override
    public void save() {
        System.out.println("[PDF]  Saving PDF Document (.pdf)...");
    }

    @Override
    public void close() {
        System.out.println("[PDF]  Closing PDF Document (.pdf)...");
    }

    @Override
    public String getDocumentType() {
        return "PDF Document (.pdf)";
    }
}