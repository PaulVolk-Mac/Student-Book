import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class AppController {
    ArrayList books = new ArrayList<Book>();
    ArrayList students = new ArrayList<Student>();
    Scanner scannerVariable = new Scanner(System.in);
    boolean i = true;
    Scanner scan = new Scanner(System.in);


    public void cases() throws InterruptedException {
        while (i == true) {
        menu();
        int number = scan.nextInt();
        try { System.out.print("You typed" + "  " + number + " " + "\n"); }
        catch (Exception e) {
            System.out.println(" Error , pls enter a -> Number <- between 1-5");
            }
            switch (number) {
                case 1:
                    createStud();
                    break;
                    case 2:
                    info();
                    break;
                    case 3:
                    changeStud();
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
    public void createStud() throws InterruptedException {
        System.out.println("You want to create a Student");
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter first name");
        String fN = keyboard.nextLine();

        System.out.println("Enter last name");
        String lN = keyboard.nextLine();

        System.out.println("enter your iD ?");
        String iD = keyboard.nextLine();

        System.out.println(" Enter book title");
        String title = keyboard.nextLine();

        System.out.println("enter book id?");
        String bookId = keyboard.nextLine();

        System.out.println(" your name is " + fN + lN + "," + iD + " is your id " + "you got the book: ");
        System.out.println(" " + title + " with the id " + bookId);
        Book book = new Book(title, bookId);
        books.add(book);
        Student stud = new Student(fN, lN, iD, Set.copyOf(books));  // cast things in object
        students.add(stud);
        Thread.sleep(400);
        System.out.print("Back to the menu  \n " +
                "...");
        Thread.sleep(400);
        System.out.println("\n");


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

    public void info() throws InterruptedException {
        if (books.isEmpty() && students.isEmpty()) {
            System.out.print("Pls create something first ;)");
        } else {
            System.out.println("Seems like you want to update a Book/Student");
            System.out.println("1 for Book and 2 for Student");
            int upd = scannerVariable.nextInt();
            if (upd == 1) {
                System.out.println("You have  " + books.size() + "added");
                int count = 0;
                for (int j = 0; j < books.size(); j++) {                 // to loop the elements and count them
                    Book bookdata = (Book) books.get(j);
                    count++;                                             // counts the amount of objects in Books
                    System.out.println(books.toString());
                    System.out.println(" choose index you want to replace , respect order starts with 0");
                    int replace1 = scannerVariable.nextInt();            // get index of the Object in Arraylist
                    int x = replace1; // changed the obect to books (bookdata before)

                    String bookName;
                    String newId;
                    Scanner bN = new Scanner(System.in);
                    System.out.println("New book title : ");
                    bookName = bN.nextLine();
                    System.out.println("new iD : ");
                    newId = bN.nextLine();
                    System.out.println("changes will be done !"); // overwirtes the Objects that were in the list
                    Book replaceBook = new Book(bookName, newId);  // created a new object that replace the object that i choose in the books.set method
                    replaceBook.setBookTitle(bookName);
                    replaceBook.setBookId(newId);
                    books.set(replace1, replaceBook);
                }
                Thread.sleep(400);
            } else {
                System.out.println("You have  " + students.size() + "added");
                int count = 0;
                for (int j = 0; j < students.size(); j++) {
                    Student studData = (Student) students.get(j);
                    count++;
                    System.out.println(students.toString());
                    System.out.println(" choose index you want to replace, respect order starts with 0");
                    int replace = scannerVariable.nextInt();        // get index of the Object in Arraylist
                    int x = replace;
                    // choose the right index ,
                    Scanner sN = new Scanner(System.in);
                    System.out.println("New firstName : ");
                    String firstName = sN.nextLine();
                    System.out.println("new lastName : ");
                    String lastName = sN.nextLine();
                    System.out.println("new Id : ");
                    String newStudentId = sN.nextLine();
                    System.out.println(" Enter new book title");
                    String newTitle = sN.nextLine();

                    System.out.println("enter new book id?");
                    String newBookId = sN.nextLine();
                    System.out.println("changes will be done !");
                    Book newBook = new Book(newTitle, newBookId);     // create object that i can set it into the Student Object
                    Student replaceStud = new Student(firstName, lastName, newStudentId, Set.copyOf(books));
                    replaceStud.setStudentOnly(firstName, lastName, newStudentId);
                    students.set(replace, replaceStud);

                    break;
                }
            }

            Thread.sleep(1000);


        }
    }

    public void changeStud(){
        if (books.isEmpty() && students.isEmpty()) {
            System.out.print("pls create something first ;)");
        } else {


            System.out.println("Info about Book = 1 or Student = 2 ?  ");
            int IBS = scannerVariable.nextInt();
            if (IBS == 1) {
                // ausgabe von Object
                System.out.println("you have " + books.size() + " added into your book DataBase");
                System.out.println(books.toString());


            } else {
                System.out.println("you have " + students.size() + " added into your student DataBase");

                System.out.println(students.toString());

            }
        }
    }

    public void deleteStud() throws InterruptedException {
        System.out.println("You want to delete a Book/Student \n" + " 1 = Book und 2 = Student");
        int count = 0;
        int wasloeschen = scannerVariable.nextInt();
        if (wasloeschen == 1) {
            System.out.println("You have  " + books.size() + "added");
            for (int j = 0; j < books.size(); j++) {  //
                Book bookdata = (Book) books.get(j);
                count++;
            }
            System.out.println(books.toString());
            System.out.println("which one do you want to delete: " +
                    "respect order of objects start by 0");
            int delete = scannerVariable.nextInt();                // created scanner to get some input from user, if Object contains userInput it should delete
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
            int delete = scannerVariable.nextInt();// created scanner to get some input from user, if Object contains userInput it should delete
            int x = delete;
            students.remove(x);
            System.out.print("I will delete him/her for you\n");

        }
        Thread.sleep(500);


    }
}