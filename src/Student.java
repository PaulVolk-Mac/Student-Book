

public class Student {
    private String lastName;
    private String age;
    private String firstName;
    private int iD;

    public Student(String firstNamename, String lastName,String age) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student() {

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

    public void getStudentByID(int iD){
        this.iD = iD;
        System.out.println("i will show you the info" + this.iD );
    }
    public void deleteStudent(){

    }
}









