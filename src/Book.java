

public class Book
{
    private String bookName;
    private String pages;
    private String author;

    public Book(String bookName, String author, String pages) {
        this.pages = pages;
        this.bookName = bookName;
        this.author = author;
    }
    @Override
    public String toString() {
        return bookName+ " " + author + "(" + pages + ")" ;

    }
        public String getBookData() { // lets try to imp
            return bookName+ " " + author + "(" + pages + ")" ;


    }

    public String getBookName() {
        return bookName;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void addBook() {

}
public void updateBook(String bookName, String author, String pages){
    this.bookName = bookName;
    this.author = author;
    this.pages = pages;

}
public void getInfoBook(){

}
public void deleteBook(){

}
    }
