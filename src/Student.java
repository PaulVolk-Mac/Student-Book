
import java.util.*;

public class Student {

    private final String studentID;
    private String lastName;
    private String firstName;
    private ArrayList<Book>books ;

    public Student( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        studentID = UUID.randomUUID().toString();
        books = new ArrayList<Book>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(getStudentID(), student.getStudentID()) && Objects.equals(getLastName(), student.getLastName()) && Objects.equals(getFirstName(), student.getFirstName()) && Objects.equals(getBooks(), student.getBooks());
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentID(), lastName, getFirstName());
    }

    public String getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iD='" + studentID + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", bookID='" + books + '\'' +

                '}';
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Book findBook(String bookID) {
        System.out.println("what id are you looking for ?");
        for (Book bookInList : books) {
            if (bookID.equals(bookInList.getBookId())) {
                System.out.println("found some" + "Bookname:" + bookInList.getBookTitle() + ", id." + bookInList.getBookId());
                return bookInList;
            }
        }
        System.out.println("nothing found");
        return null;
    }

}

