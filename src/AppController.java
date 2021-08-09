import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

public class AppController  {
    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<Student> students = new ArrayList<Student>();
    Scanner scan = new Scanner(System.in);
    boolean i = true;
will was ändern

    public void cases() throws InterruptedException {
        while (i == true) {
            menu();
            int number = scan.nextInt();
            try {
                System.out.print("You typed" + "  " + number + " " + "\n");
            } catch (Exception e) {
                System.out.println(" Error , pls enter a -> Number <- between 1-5");
            }
            switch (number) {
                case 1:
                    createStud();
                    break;
                case 2:
                    changeStud();
                    break;
                case 3:
                    info();
                    break;
                case 4:
                    deleteStud();
                    break;
                case 5:
                    System.out.println("You will leave the application");
                    i = false;
                    break;
                default:
            }
        }
    }

    public void menu() {
        System.out.print("What do you want to do today ? (hint: start with creating something)  \n" +
                "1 = I want to create a Book / Student \n " +
                "2 = I want to update a Book / Student \n " +
                "3 = I need  information about a Book /Student \n " +
                "4 = I want to delete a Book / Student \n " +
                "5 = I want to Exit \n");
        System.out.print("Type in your number(1-5) : ");

    }

    public void createStud() throws InterruptedException {
        scan.nextLine();
        System.out.println("You want to create a Student");
        System.out.println(" Enter first name" );
        String fN = scan.nextLine();
        System.out.println("Enter last name");
        String lN = scan.nextLine();
        System.out.println("your Id will be generated");
        String iD = UUID.randomUUID().toString().trim();
        checkDouble(iD);
        System.out.println(" Enter book title");
        String title = scan.nextLine();
        System.out.println("Book ID will be generated");
        String bookId = UUID.randomUUID().toString().trim();

        System.out.println(" your name is " + fN + lN + "," + iD + " is your id " + "you got the book: ");
        System.out.println(" " + title + " with the id " + bookId);
        Book book = new Book(title, bookId);
        books.add(book);
        Student stud = new Student(fN, lN, iD);  // cast things in object
        students.add(stud);
        stud.getBooks().add(book);
        Thread.sleep(400);
        System.out.print("Back to the menu  \n " +
                "...");
        Thread.sleep(400);
        System.out.println("\n");
    }


    public void changeStud() throws InterruptedException {
        if (books.isEmpty() && students.isEmpty()) {
            System.out.print("Pls create something first ;)");
        } else {
            System.out.println("Seems like you want to update a Book/Student");
            System.out.println("1 for Book and 2 for Student");
            int upd = scan.nextInt();
            if (upd == 1) {
                System.out.println("You have  " + books.size() + "added");
                int count = 0;
                for (int j = 0; j < books.size(); j++) {                 // to loop the elements and count them
                    count++;                                             // counts the amount of objects in Books
                    System.out.println(books.toString());
                }
                System.out.println("type in your bookid :");
                String findId = scan.nextLine();

                if(findBook(findId) == true) {
                    System.out.println("New book title : ");
                    String newBookTitle = scan.nextLine();
                    System.out.println("new iD : ");
                    String newBookId = scan.nextLine();
                    System.out.println("changes will be done !");
                    Book replaceBook = new Book(newBookTitle, newBookId);
                    replaceBook.setBookTitle(newBookTitle);
                    replaceBook.setBookId(newBookId);

                }
                Thread.sleep(400);
            } else {
                System.out.println("You have  " + students.size() + "added");
                int count = 0;
                for (int j = 0; j < students.size(); j++) {
                    Student studData = (Student) students.get(j);
                    count++;
                    System.out.println(students.toString() + "\n" + "Enter Id of your student");
                    scan.nextLine();
                    String studID = scan.nextLine();
                    if(findStudent(studID)) {
                        System.out.println("New firstName : ");
                        String firstName = scan.nextLine();
                        System.out.println("new lastName : ");
                        String lastName = scan.nextLine();
                        System.out.println("new Id : ");
                        String newStudentId = UUID.randomUUID().toString().trim();
                        checkDouble(newStudentId);
                        System.out.println(" Enter new book title");
                        String newTitle = scan.nextLine();
                        System.out.println("enter new book id?");
                        String newBookId = UUID.randomUUID().toString().trim();
                        System.out.println("changes will be done !");
                        Book newBook = new Book(newTitle, newBookId);     // create object that i can set it into the Student Object
                        Student replaceStud = new Student(firstName, lastName, newStudentId);
                        replaceStud.setStudentID(newStudentId);
                        replaceStud.setLastName(lastName);
                        replaceStud.setFirstName(firstName);
                        break;
                    }
                }
            }

            Thread.sleep(1000);


        }
    }

    public void info() {
        if (books.isEmpty() && students.isEmpty()) {
            System.out.print("pls create something first ;)");
        } else {
            System.out.println("Info about Student = 1 or Book = 2 ?  ");
            int IBS = scan.nextInt();
            if (IBS == 1) {
                // ausgabe von Object
                for (int i = 0; i < books.size(); i++) {
                    System.out.println("you have " + books.size() + " added into your book DataBase");
                    System.out.println(books.get(i));
                }
            } else {
                System.out.println("you have " + students.size() + " added into your student DataBase");
                System.out.println(students.toString());
            }
        }
    }

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

    public boolean findBook(String bookID) {
        System.out.println("what id are you looking for ?");
        for (Student bookInList : students) {
            if (bookID.equals(bookInList.getBookId())) {
                System.out.println("gefunden" + "Name:" + bookInList.getFirstName() + "id." + bookInList.getBookId());
                return true;
            }
        }
        System.out.println("nichts gefunden");
        return false;
    }

    public boolean findStudent(String studID) {
        System.out.println("what id are you looking for ?");
        for (Student studInList : students) {
            if (studID.equals(studInList.getStudentID())) {
                System.out.println("gefunden" + "Name:" + studInList.getFirstName() + "id." + studInList.getStudentID());
                System.out.println();
                return true;
            }

        }
        System.out.println("nichts gefunden");
        return false;
    }

    public boolean checkDouble(String StudentID) {
        System.out.println("checking if id already been used");
        for (Student studentCheck : students)
            if (students.contains(this.findBook(StudentID))) {
                System.out.println("the id is already been used " + studentCheck.getStudentID());
                return true;
            }
        System.out.println("go on");
            return false;
    }
}