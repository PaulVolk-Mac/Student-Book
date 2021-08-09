import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

public class AppController {

    ArrayList<Student> students = new ArrayList<Student>();
    Scanner scan = new Scanner(System.in);


    public void cases() throws InterruptedException {
        start:
        while (true) {
            menu(); // sout kann man in die Main direkt rein packen
            int number = 0;
            try {
                number = scan.nextInt();
                System.out.print("You typed" + "  " + number + " " + "\n");
            } catch (Exception e) {
                System.out.println(" Error , pls enter a -> Number <- between 1-6");
            }
            switch (number) {
                case 1:
                    createStud();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                     info();
                    break;
                case 4:
                    //  deleteStud();
                    break;
                case 5:
                      changeStud();
                case 6:
                    System.out.println("You will leave the application");
                    break start;
                default:
            }
        }
    }

    public void menu() {
        System.out.print("What do you want to do today ? (hint: start with creating something)  \n" +
                "1 = I want to create a Student \n " +
                "2 = I want to add a Book to Student \n " +
                "3 = I need  information about a Book or Student \n " +
                "4 = I want to delete a Student or Book \n " +
                "5 = I want to update Student or Book \n " +
                "6 = I want to Exit \n");
        System.out.print("Type in your number(1-6) : ");

    }

    public void createStud() throws InterruptedException {
        scan.nextLine();
        System.out.println("You want to create a Student ");
        System.out.println(" Enter first name ");
        String fN = scan.nextLine();
        System.out.println("Enter last name ");
        String lN = scan.nextLine();
        System.out.println("your Id will be generated ");
        Student stud = new Student(fN, lN);
        students.add(stud);
        System.out.println(" your name is " + fN + lN + "," + stud.getStudentID() + " is your id ");
        Thread.sleep(400);
        System.out.print("Back to the menu  \n " +
                "...");
        Thread.sleep(400);
        System.out.println("\n");
    }

    public void addBook() {

        if (students.isEmpty()) {
            System.out.println("cant add Book without student , create stud first ... ");
        } else {
            System.out.println("choose one of the following student by entering the correct id ");
            for (Student studInList : students) {
                System.out.println("found some " + "firstname: " + studInList.getFirstName() + " lastname " + studInList.getLastName() + " id " + studInList.getStudentID() + "\n");
            }
            System.out.println("enter id of the student ");
            scan.nextLine();
            String studID = scan.nextLine().trim();
            Student chosenStudent = findStudent(studID);
            if (chosenStudent != null) {
                System.out.println("pls enter your book title ");
                String bookTitle = scan.nextLine().trim();
                Book bookToStudent = new Book(bookTitle);
                chosenStudent.getBooks().add(bookToStudent);
                System.out.println("added succecsfully ");
            } else {
                System.out.println("no student found with the entered id ");
            }
        }

    }

    public void changeStud() throws InterruptedException {
        if (students.isEmpty()) {
            System.out.print("Pls create a student first ;) ");
        } else {
            System.out.println("Seems like you want to update a Student ");
            System.out.println("You have  " + students.size() + "added ");
            int count = 0;
            for (Student studInList : students) {
                System.out.println("found some " + " firstname: " + studInList.getFirstName() + " lastname " + studInList.getLastName() + " id " + studInList.getStudentID() + "\n");
            }
            System.out.println("enter id of the student");
            scan.nextLine();
            String studID = scan.nextLine().trim();
            Student chosenStudent = findStudent(studID);
            if (chosenStudent != null) {
                System.out.println("pls enter your FirstName");
                String newFirstN = scan.nextLine();
                chosenStudent.setFirstName(newFirstN);
                System.out.println("pls enter your LastName");
                String newLastN = scan.nextLine();
                chosenStudent.setFirstName(newLastN);
            } else {
                System.out.println("no student found with the entered id");
            }
        }
    }



    public void info() {
        if ( students.isEmpty()) {
            System.out.print("pls create a student first ;)");
        } else {
            for (Student studInList : students) {
            }
            System.out.println("enter id of the student");
            scan.nextLine();
            String studID = scan.nextLine().trim();
            Student chosenStudent = findStudent(studID);
            System.out.println(" found some " + "firstname: " + chosenStudent.getFirstName() + " lastname " + chosenStudent.getLastName() + " id " + chosenStudent.getStudentID() + chosenStudent.getBooks() + "\n");
            }
        }

/*
    public void deleteStud() throws InterruptedException {
        System.out.println("You want to delete a Book/Student \n" + " 1 = Book und 2 = Student");
        int count = 0;
        int wasloeschen = scan.nextInt();
        if (wasloeschen == 1) {
            System.out.println("You have  " + books.size() + "added");
            for (int j = 0; j < books.size(); j++) {  //
                Book bookdata = books.get(j);
                count++;
            }
            System.out.println(books.toString());
            System.out.println("which one do you want to delete: " +
                    "respect order of objects start by 0");
            int delete = scan.nextInt();                // created scanner to get some input from user, if Object contains userInput it should delete
            int x = delete;
            books.remove(x);  // asked for the index that has to be removed , and removed it
            System.out.print("I will delete it for you\n");
            Thread.sleep(500);


        } else {
            for (int j = 0; j < students.size(); j++) {  //
                Student studdata = (Student) students.get(j);
                count++;
            }
            System.out.println(students.toString());
            System.out.println("which one do you want to delete: " +
                    "respect order of objects start by 0");
            int delete = scan.nextInt();// created scanner to get some input from user, if Object contains userInput it should delete
            int x = delete;
            students.remove(x);
            System.out.print("I will delete him/her for you\n");

        }
        Thread.sleep(500);


    }
*/


    public Student findStudent(String studID) {
        System.out.println("what id are you looking for ?");
        for (Student studInList : students) {
            if (studID.equals(studInList.getStudentID())) {
                System.out.println("gefunden " + " Name: " + studInList.getFirstName() + " id." + studInList.getStudentID());
                System.out.println();
                return studInList;
            }

        }
        System.out.println("nichts gefunden");
        return null;
    }


}