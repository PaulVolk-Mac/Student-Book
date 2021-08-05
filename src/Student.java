import java.awt.List;
import java.util.*;


public class Student extends Book {
    //Attribute
    private String studentID;
    private String lastName;
    private String firstName;
    private ArrayList<Book>books = new ArrayList<>();


    public Student( String firstName, String lastName ,String studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.books = books;

    }
    //Methods


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(getStudentID(), student.getStudentID()) && Objects.equals(getLastName(), student.getLastName()) && Objects.equals(getFirstName(), student.getFirstName()) && Objects.equals(getBooks(), student.getBooks());
    }




    @Override
    public int hashCode() {
        return Objects.hash(getStudentID(), lastName, getFirstName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "iD='" + studentID + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", bookID='" + getBookData() + '\'' +

                '}';
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}










