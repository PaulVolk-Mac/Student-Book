import java.util.*;
import java.util.ArrayList;


public class Student extends Book{
    //Attribute
    private String iD = UUID.randomUUID().toString();
    private String lastName;
    private String firstName;



    public  Student(String iD, String firstName, String lastName , Set<Book>books) {
        super();
        this.iD = iD;
        this.firstName = firstName;
        this.lastName = lastName;

    }
    //Methods
    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getiD(), student.getiD()) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(getFirstName(), student.getFirstName());
    }

    @Override public int hashCode() {
        return Objects.hash(getiD(), lastName, getFirstName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "iD='" + iD + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", bookID='" + getBookData() + '\'' +

                '}';
    }

    public String getLastname() {
        return lastName;
    }

    public String getiD() {
        return iD;
    }

    public void setAge(String iD) {
        this.iD = iD;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setiD(String iD) { this.iD = iD;
    }
    public String getLastName() { return lastName;
    }
    public void setLastName(String lastName) { this.lastName = lastName;
    }
    public void setStudentOnly(String firstName, String lastName, String iD){
        this.firstName = firstName;
        this.lastName = lastName;
        this.iD = iD;
    }
    public void getStudent() {
        Scanner scanStud = new Scanner(System.in);
        int sc = scanStud.nextInt();


    }

}









