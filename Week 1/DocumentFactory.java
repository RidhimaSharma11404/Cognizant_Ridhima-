// Step 4: Abstract Factory class with the Factory Method
public abstract class DocumentFactory {

   
    // Subclasses decide WHICH document to use
    public abstract Document createDocument();

    // Common workflow :— uses the factory method internally
    public void openDocument() {
        Document doc = createDocument();
        System.out.println("--- Created: " + doc.getDocumentType() + " ---");
        doc.open();
        doc.save();
        doc.close();
        System.out.println();
    }
}