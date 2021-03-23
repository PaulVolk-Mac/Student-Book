import java.util.Objects;
import java.util.Set;


public class Student extends Book{
    private String iD;
    private String lastName;
    private String firstName;

    @Override
    public boolean equals(Object o) {   // auto generate the equals and hashcodes
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getiD(), student.getiD()) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(getFirstName(), student.getFirstName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getiD(), lastName, getFirstName());
    }

    public Student(String iD, String firstName, String lastName, Set<Book> books) { // need to add one attribute
        this.iD = iD;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "firstname " + firstName + " lastname " + lastName + " iD (" + iD + ")";
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

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }



    public void updateStudent(String firstName, String lastName, String iD){
        this.firstName = firstName;
        this.lastName = lastName;
        this.iD = iD;


    }
    public void getInfoStudent(){

    }
    public void deleteStudent(){

    }
}









