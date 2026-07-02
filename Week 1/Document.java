// Base interface
public interface Document {
    void open();
    void save();
    void close();
    String getDocumentType();
}