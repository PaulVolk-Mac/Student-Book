import java.util.Scanner;

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

    public Book() {

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

    public void setNewBook() {
        Scanner scan = new Scanner(System.in);
        int replace1 = scan.nextInt();            // get index of the Object in Arraylist
        int x = replace1; // changed the obect to books (bookdata before) // didnt worked out

        String bookName;
        String author;
        String pages;
        Scanner bN = new Scanner(System.in);
        System.out.println("New book name : ");
        bookName = bN.nextLine();
        System.out.println("new author : ");
        author = bN.nextLine();
        System.out.println("new pages : ");
        pages = bN.nextLine();
        System.out.println("changes will be done !"); // old commentar // i think this doubles the work // it changes both objects
        Book replaceBook = new Book(bookName,author,pages);  // created a new object that replace the object that i choose in the books.set method
        replaceBook.updateBook(bookName, author, pages);
        // ovrwirtes the Objects that were in the list


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
