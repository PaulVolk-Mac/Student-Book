import java.util.Objects;
import java.util.UUID;

public class Book {

    private String bookTitle;
    private final String bookId;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
        bookId = UUID.randomUUID().toString();
    }

    public String setBookTitle(String bookTitle) {
        return this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookId='" + bookId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getBookTitle().equals(book.getBookTitle()) && getBookId().equals(book.getBookId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookTitle(), getBookId());
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookId() {
        return bookId;
    }

}

