import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Main {


    public static void main(String[] args) throws InterruptedException {
        ArrayList books = new ArrayList<Book>();  // list where books be saved // not sure about : ** new ArrayList<Book>() should be <String> **
        ArrayList students = new ArrayList<Student>(); // list where students be saved


        int i = 1;

        while (i == 1) { // run the application until case 5 happens
            System.out.println("What do you want to do today ? (hint: start with creating something)  \n" +
                    "1 = I want to create a Book / Student \n " +
                    "2 = I watnt o update a Book / Student \n " +
                    "3 = I need  information about a Book /Student \n " +
                    "4 = I want to delete a Book / Student \n " +
                    "5 = I want to Exit \n");
            Scanner scannerVariable = new Scanner(System.in);

            System.out.print("Type in your number(1-5) : ");
            int number = 0;
            try {
                number = scannerVariable.nextInt();
                System.out.print("You typed" + "  " + number + " " + "\n");
            } catch (Exception e) {
                System.out.println(" Error , pls enter a -> Number <- between 1-5");
            }
            switch (number) {
                case 1:
                    int buch = 0;
                    try {
                        System.out.println("What do you want to create ? Book  = 1 / Student =  2 ");
                         buch = scannerVariable.nextInt();
                    }catch (Exception e){
                        System.out.println("type in a number ");
                    }
                    if (buch == 1) {
                        Scanner keyboard = new Scanner(System.in);
                        System.out.println(" Enter book name");
                        String bN = keyboard.nextLine();

                        System.out.println("Enter name of the author");
                        String aut = keyboard.nextLine();

                        System.out.println("how many pages does the book have ?");
                        String page = keyboard.nextLine();

                        System.out.println(" Your Book name is " + bN + " written by " + aut + " and has " + page + " pages");
                        Book book = new Book(bN, aut, page);
                        books.add(book); //
                    } else {
                        Scanner keyboard = new Scanner(System.in);
                        System.out.println(" Enter first name");
                        String fN = keyboard.nextLine();

                        System.out.println("Enter last name");
                        String lN = keyboard.nextLine();

                        System.out.println("how old are you ?");
                        String age1 = keyboard.nextLine();

                        System.out.println(" your name is " + fN + lN + "," + age1 + " years old");
                        Student stud = new Student(fN, lN, age1);
                        students.add(stud);
                    }
                    Thread.sleep(1000);
                    System.out.print("Back to the menu  \n " +
                            "...");
                    Thread.sleep(1000);
                    System.out.println("\n");
                    break;

                case 2:
                    if (books.isEmpty() && students.isEmpty()) {
                        System.out.print("Pls create something first ;)");
                    } else {
                        System.out.println("Seems like you want to update a Book/Student");
                        System.out.println("1 Book and 2 is Student");
                        int upd = scannerVariable.nextInt();
                        if (upd == 1) {
                            System.out.println("You have  " + books.size() + "added");
                            int count = 0;
                            //System.out.println(Books.toString());
                            for (int j = 0; j < books.size(); j++) {  // to loop the elemetns and cound them
                                Book bookdata = (Book) books.get(j);
                                System.out.println(books.toString());
                                count++;// counts the amout of objects in Books

                                Scanner bN = new Scanner(System.in);
                                System.out.println("New book name : ");
                                String bookName = bN.nextLine();
                                System.out.println("new author : ");
                                String author = bN.nextLine();
                                System.out.println("new pages : ");
                                String pages = bN.nextLine();
                                System.out.println("changes will be done !");
                                bookdata.updateBook(bookName, author, pages); // ovrwirtes the Objects that were in the list

                                Thread.sleep(1000);
                            }
                        } else {
                            System.out.println("You have  " + books.size() + "added");
                            int count = 0;
                            //System.out.println(Books.toString());
                            for (int j = 0; j < students.size(); j++) {
                                Student studData = (Student) students.get(j);
                                System.out.println(studData.toString());
                                count++;
                                Scanner sN = new Scanner(System.in);
                                System.out.println("New firstName : ");
                                String firstName = sN.nextLine();
                                System.out.println("new lastName : ");
                                String lastName = sN.nextLine();
                                System.out.println("new age : ");
                                String age = sN.nextLine();
                                System.out.println("changes will be done !");
                                studData.updateStudent(firstName, lastName, age);
                                Thread.sleep(1000);
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    if (books.isEmpty() && students.isEmpty()) {
                        System.out.print("pls create something first ;)");
                    } else {


                        System.out.println("Info about Book = 1 or Student = 2 ?  ");
                        int IBS = scannerVariable.nextInt();
                        if (IBS == 1) {
                            // ausgabe von Object
                            System.out.println(books.toString());


                        } else {
                            System.out.println(students.toString());
                        }
                    }
                    break;
                case 4:
                    System.out.println("You want to delete a Book/Student \n" + " 1 = Buch und 2 = Student");
                    System.out.println("You have  " + books.size() + "added");
                    int count = 0;
                    int wasloeschen = scannerVariable.nextInt();
                    if (wasloeschen == 1) {
                    // tried to get a specific element from list
                        for (int j = 0; j < books.size(); j++) {  //
                        Book bookdata = (Book) books.get(j);
                        count++;
                        }
                        System.out.println(books.toString());
                        System.out.println("which one do you want to delete: " +
                                            "respect order of objects start by 0");
                        int delete = scannerVariable.nextInt();// created scanner to get some input from user, if Object contains userInput it should delete
                        int x= delete;
                        books.remove(x);
                        System.out.print("I will delete it for you\n");


                    }else {
                            System.out.println(students);
                            System.out.println("Which studendo you want to delete?");
                            students.clear();
                            System.out.print("I will delete him for you  \n ");
                        }


                    break;

                case 5:
                    System.out.println("You will leave the application");
                    i++;
            }
        }


        }

       /* public static void addBook() {

                Scanner keyboard = new Scanner(System.in);
                System.out.println(" Enter book name");
                String bN = keyboard.nextLine();

                System.out.println("Enter name of the author");
                String aut = keyboard.nextLine();

                System.out.println("how many pages does the book have ?");
                int page = keyboard.nextInt();

                System.out.println(" Your Book name is " + bN + "written by" + aut + "and has" + page + " pages");
                Book book = new Book(bN,aut,page);
                Books.add(book);




        public static String addStudent() {


                Scanner keyboard = new Scanner(System.in);
                System.out.println(" Enter first name");
                String fN = keyboard.nextLine();

                System.out.println("Enter last name");
                String lN = keyboard.nextLine();

                System.out.println("how old are you ?");
                int age1 = keyboard.nextInt();

                System.out.println(" your name is " + fN + lN + "," + age1 + " years old");

                return fN + lN + age1;

        */
    }




