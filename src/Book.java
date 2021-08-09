import java.util.Objects;
import java.util.UUID;


public class Book {

    //Attribute
    private String bookTitle;
    private String bookId;



    // Konstruktor
    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
        bookId = UUID.randomUUID().toString();
    }

    //Methoden

    public String getBookTitle() {
        return bookTitle;
    }

    public String setBookTitle(String bookTitle) {
        return this.bookTitle = bookTitle;
    }

    public String getBookId() {
        return bookId;
    }

    public String setBookId(String bookId) {
        return this.bookId = bookId;
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
        return Objects.equals(getTitle(), book.getTitle()) &&
                Objects.equals(getId(), book.getId());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getId());
    }


    public String getTitle() {
        return bookTitle;
    }

    public String setTitle(String title) {
        return this.bookTitle = bookTitle;
    }

    public String getId() {
        return bookId;
    }

    public String setId(String id) {
        return this.bookId = bookId;
    }

    public String getBookData() {
        return bookTitle+ " " +   "(" + bookId+ ")" ;
    }



}





