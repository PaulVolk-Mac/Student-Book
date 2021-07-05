import java.util.*;
import java.util.ArrayList;


public class Student extends Book{
    //Attribute
    private String studentID ;
    private String lastName;
    private String firstName;
    private Set<Book>books;



    public  Student(String studentID, String firstName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        Set<Book>books = new Set<Book>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Book> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Book book) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Book> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
    }
    //Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(getiD(), student.getiD()) && Objects.equals(getLastName(), student.getLastName()) && Objects.equals(getFirstName(), student.getFirstName()) && Objects.equals(books, student.books);
    }



    @Override public int hashCode() {
        return Objects.hash(getiD(), lastName, getFirstName());
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

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public String getLastname() {
        return lastName;
    }

    public String getiD() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String setFirstname(String firstName){ return this.firstName;}

    public void setiD(String iD) { this.studentID = iD;
    }
    public String getLastName() { return lastName;
    }
    public void setLastName(String lastName) { this.lastName = lastName;
    }
    public void getStudent() {
        Scanner scanStud = new Scanner(System.in);
        int sc = scanStud.nextInt();
    }
    public Set<Book> getBooks() {
        return books;
    }
}









