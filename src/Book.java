//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Book {
    private String bookName;
    private String pages;
    private String author;

    public Book(String bookName, String author, String pages) {
        this.pages = pages;
        this.bookName = bookName;
        this.author = author;
    }

    public String toString() {
        return this.bookName + " " + this.author + "(" + this.pages + ")";
    }

    public String getBookData() {
        return this.bookName + " " + this.author + "(" + this.pages + ")";
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getPages() {
        return this.pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void addBook() {
    }

    public void updateBook(String bookName, String author, String pages) {
        this.bookName = bookName;
        this.author = author;
        this.pages = pages;
    }

    public void getInfoBook() {
    }

    public void deleteBook() {
    }
}