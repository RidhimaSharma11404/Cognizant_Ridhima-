// Step 5: Test class to demonstrate the Factory Method Pattern
public class FactoryMethodTest {

    public static void main(String[] args) {

        System.out.println("   Factory Method Pattern - Demo");
      

       
        // Test 1: Create a Word Document using its factory
       
        System.out.println("Test 1: Word Document Factory");
        DocumentFactory wordFactory = new WordDocumentFactory();
        wordFactory.openDocument();

       
        // Test 2: Create a PDF Document using its factory
      
        System.out.println("Test 2: PDF Document Factory");
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        pdfFactory.openDocument();

       
        // Test 3: Create an Excel Document using its factory
        System.out.println("Test 3: Excel Document Factory");
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        excelFactory.openDocument();

     
        // Test 4: Use createDocument() directly
    
        System.out.println("Test 4: Direct createDocument() calls");
        Document doc1 = new WordDocumentFactory().createDocument();
        Document doc2 = new PdfDocumentFactory().createDocument();
        Document doc3 = new ExcelDocumentFactory().createDocument();

        System.out.println("doc1 type: " + doc1.getDocumentType());
        System.out.println("doc2 type: " + doc2.getDocumentType());
        System.out.println("doc3 type: " + doc3.getDocumentType());

        
        System.out.println("   All Tests Completed Successfully!");
        
    }
}