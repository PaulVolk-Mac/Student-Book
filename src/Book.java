import java.util.Objects;

public class Book {

       //Attribute
        private String bookTitle;
        private String bookId;



    // Konstruktor
    public Book(){

    }

    public Book(String bookTitle, String bookId) { // 2 attributes now
        this.bookTitle = bookTitle;
        this.bookId = bookId;

    }
    //Methoden

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

    public void updateBook(String title, String id){
    this.bookTitle = bookTitle;
    this.bookId = bookId;

    }
    public void getInfoBook(){
    }
    public void deleteBook(){

}
    }
