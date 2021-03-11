

public class Student {
    private String lastName;
    private String age;
    private String firstName;

    public Student(String firstNamename, String lastName,String age) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "firstname " + firstName + " lastname " + lastName + " ages (" + age + ")";
    }
    public String getLastname() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }



    public void updateStudent(String firstName, String lastName, String age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;


    }
    public void getInfoStudent(){

    }
    public void deleteStudent(){

    }
}









