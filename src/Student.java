

public class Student {
    private final String lastName;
    private int age;
    private String firstName;

    public Student(String firstNamename, String lastName,int age) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + "(" + age + ")";
    }
    public String getLastname() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }



    public void updateStudent(){

    }
    public void getInfoStudent(){

    }
    public void deleteStudent(){

    }
}









