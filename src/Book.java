import java.util.Objects;
import java.util.UUID;

public class Book {

       //Attribute
        private String bookTitle;
        private String bookId = UUID.randomUUID().toString();



    // Konstruktor
    public Book(String bookTitle,String bookId) {
        this.bookTitle = bookTitle;
        this.bookId = bookId;

    }

    public Book() {

    }
    //Methoden

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
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

    public void setTitle(String title) {
        this.bookTitle = bookTitle;
    }

    public String getId() {
        return bookId;
    }

    public void setId(String id) {
        this.bookId = bookId;
    }

    public String getBookData() {
            return bookTitle+ " " +   "(" + bookId+ ")" ;
    }



    }


