import java.util.ArrayList;
import java.util.Scanner;

public class AppController {

    ArrayList<Student> students = new ArrayList<Student>();
    Scanner scan = new Scanner(System.in);

    public void cases() throws InterruptedException {
        start:
        while (true) {
            menu();
            String number = scan.nextLine();
            System.out.print("You typed" + "  " + number + " " + "\n");
            switch (number) {
                case "1":
                    createStud();
                    break;
                case "2":
                    addBook();
                    break;
                case "3":
                    info();
                    break;
                case "4":
                    deleteStud();
                    break;
                case "5":
                    deleteBook();
                    break;
                case "6":
                    changeStud();
                    break;
                case "7":
                    System.out.println("You will leave the application");
                    break start;
                default :
                    System.out.println("invalid input");

            }
        }
    }

    public void menu() {
        System.out.print("What do you want to do today ? (hint: start with creating something)  \n" +
                "1 = I want to create a Student \n " +
                "2 = I want to add a Book to Student \n " +
                "3 = I need  information about a Book or Student \n " +
                "4 = I want to delete a Student \n " +
                "5 = I want to delete a Book \n " +
                "6 = I want to update a Student \n" +
                "7 = I want to Exit \n");
        System.out.print("Type in your number(1-7) : ");

    }

    public void createStud()  {
        System.out.println("Create a student :... ");
        System.out.println(" Enter first name ");
        String fN = scan.nextLine();
        System.out.println("Enter last name ");
        String lN = scan.nextLine();
        System.out.println("Your Id will be generated ");
        Student stud = new Student(fN, lN);
        students.add(stud);
        System.out.println(" Your name is : " + fN + lN + ", Your Id is : " + stud.getStudentID()  );
        System.out.print("Back to the menu  \n " +
                "...");
        System.out.println("\n");
    }

    public void addBook() {

        if (students.isEmpty()) {
            System.out.println("You cant add a Book without an existing student , create student first ... ");
        } else {
            boolean addBook = true;
            while (addBook) {
                System.out.println("Choose one of the following students by entering the correct id ");
                for (Student studInList : students) {
                    System.out.println("Found some " + " firstname: " + studInList.getFirstName() + " lastname " + studInList.getLastName() + " id " + studInList.getStudentID() + "\n");
                }
                System.out.println("Enter id of the student ");
                String studID = scan.nextLine().trim();
                Student chosenStudent = findStudent(studID);
                boolean run =true;
                if(chosenStudent != null) {
                    while (run) {
                        System.out.println("Enter a booktitel now ");
                        String bookTitle = scan.nextLine().trim();
                        Book bookToStudent = new Book(bookTitle);
                        chosenStudent.getBooks().add(bookToStudent);
                        System.out.println("Added successfully ");
                        System.out.println("You want to add another book ?   \n " +
                                " press enter to skip this step ");
                        String anotherBook = scan.nextLine().trim();
                        if (anotherBook.isBlank()) {
                            run = false;
                        }
                    }
                }else {
                     System.out.println("No student found with the entered id ");
                }
            addBook = false;
            }

        }
    }

    public void info() {
        if (students.isEmpty()) {
            System.out.print("You have to create a Student first");
        } else {
            for (Student studInList : students) {
                System.out.println("Found some " + " firstname: " + studInList.getFirstName() + " lastname " + studInList.getLastName() + " id " + studInList.getStudentID() + "\n");
            }
            System.out.println("Enter id of the student");
            String studID = scan.nextLine().trim();
            Student chosenStudent = findStudent(studID);
            System.out.println(" Found some " + " firstname: " + chosenStudent.getFirstName() + " , lastname : " + chosenStudent.getLastName() + " , id : " + chosenStudent.getStudentID() +" Following " + chosenStudent.getBooks() + "\n");
        }
    }

    public void deleteStud()  {
        System.out.println("You want to delete a Student ");
        for (Student studInList : students) {
            System.out.println("Found some " + "firstname: " + studInList.getFirstName() + " lastname " + studInList.getLastName() + " id " + studInList.getStudentID() + "\n");
        }
        System.out.println("Enter Id now of the student you want to delete:   ");
        String studID = scan.nextLine().trim();
        Student chosenStudent = findStudent(studID);
        if (chosenStudent != null) {
            students.remove(chosenStudent);
            System.out.print("I will delete him/her for you\n");
        }
    }

    public void deleteBook()  {
        System.out.println("You want to delete a Book , enter your students id first ");
        for (Student student : students) {
            System.out.println("Found some " + "firstname: " + student.getFirstName() + " lastname " + student.getLastName() + " id " + student.getStudentID() +
                    "\n");
        }

        System.out.println("Enter student id first");
        String studID = scan.nextLine().trim();
        Student chosenStudent = findStudent(studID);
        if (chosenStudent != null) {
            for (Book booksInList : chosenStudent.getBooks()) {
                System.out.println("found some " + "title: " + booksInList.getBookTitle() +  " id " + booksInList.getBookId() + "\n");
            }
            System.out.println("enter the id of your book now ");
            String bookID = scan.nextLine();
            Book bookToDelete = chosenStudent.findBook(bookID);
            if(bookToDelete != null){
                chosenStudent.getBooks().remove(bookToDelete);
            }else{
                System.out.println("wrong id we will head back to menu");
            }
            System.out.print("I will delete him/her for you\n");
        }

    }

    public void changeStud()  {
        if (students.isEmpty()) {
            System.out.print("Pls create a student first ;) ");
        } else {
            System.out.println("Seems like you want to update a Student ");
            System.out.println("You have  " + students.size() + "added ");
            for (Student studInList : students) {
                System.out.println("found some " + " firstname: " + studInList.getFirstName() + " lastname " + studInList.getLastName() + " id " + studInList.getStudentID() + "\n");
            }
            System.out.println("enter id of the student");
            String studID = scan.nextLine().trim();
            Student chosenStudent = findStudent(studID);
            if (chosenStudent != null) {
                System.out.println("pls enter new firstName");
                String newFirstN = scan.nextLine();
                chosenStudent.setFirstName(newFirstN);
                System.out.println("pls enter your lastName");
                String newLastN = scan.nextLine();
                chosenStudent.setLastName(newLastN);
                System.out.println("successfully updated");
            } else {
                System.out.println("no student found with the entered id");
            }
        }
    }

    public Student findStudent(String studID) {
        System.out.println("what id are you looking for ?");
        for (Student studInList : students) {
            if (studID.equals(studInList.getStudentID())) {
                System.out.println("found him " + " name: " + studInList.getFirstName() + " id." + studInList.getStudentID());
                System.out.println();
                return studInList;
            }

        }
        System.out.println("nothing found");
        return null;
    }

}