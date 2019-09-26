import java.util.HashMap;
import java.util.Map;

public class Books {
    private Map<String, String> books = new HashMap<>();

    public Books() {
    }

    public Books(Map<String, String> books) {
        this.books = books;
    }

    public Map<String, String> getBooks() {
        return books;
    }

    public void setBooks(Map<String, String> books) {
        this.books = books;
    }

    @MyAnnotation(paramOne = "Harry Potter and the Philosopher's Stone", paramTwo = "Joanne Rowling")
    public void addBook(String title, String author) {
        books.put(title, author);
    }

    @Override
    public String toString() {
        return "Books{" +
                "books=" + books +
                '}';
    }
}
