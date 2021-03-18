import java.util.Set;

public class Student {
    private String iD;
    private String lastName;
    private String firstName;

    public Student(String iD,String firstName, String lastName) { // need to add one attribute
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









