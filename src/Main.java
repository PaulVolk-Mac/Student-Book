import java.util.ArrayList;
import java.util.Scanner;



public class Main {



        public static void main(String[] args) {
                ArrayList Books= new ArrayList<Book>();  // list where books be saved // not sure about : ** new ArrayList<Book>() should be <String> **
                ArrayList Students = new ArrayList<Student>(); // list where students be saved


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
                        int number = scannerVariable.nextInt();
                        System.out.print("You typed" + "  " + number + " " +   "\n");


                        switch (number) {
                                case 1:
                                        System.out.println("What do you want to create ? Book  = 1 / Student =  2 ");
                                        int buch = scannerVariable.nextInt();
                                        if (buch == 1) {


                                                        Scanner keyboard = new Scanner(System.in);
                                                        System.out.println(" Enter book name");
                                                        String bN = keyboard.nextLine();

                                                        System.out.println("Enter name of the author");
                                                        String aut = keyboard.nextLine();

                                                        System.out.println("how many pages does the book have ?");
                                                        String page = keyboard.nextLine();

                                                        System.out.println(" Your Book name is " + bN + " written by " + aut + " and has " + page + " pages");
                                                        Book book = new Book(bN,aut,page);
                                                        Books.add(book); //






                                        } else {

                                                Scanner keyboard = new Scanner(System.in);
                                                System.out.println(" Enter first name");
                                                String fN = keyboard.nextLine();

                                                System.out.println("Enter last name");
                                                String lN = keyboard.nextLine();

                                                System.out.println("how old are you ?");
                                                int age1 = keyboard.nextInt();

                                                System.out.println(" your name is " + fN + lN + "," + age1 + " years old");
                                                Student stud = new Student(fN,lN,age1);
                                                Students.add(stud);
                                        }
                                        System.out.print("Back to the menu  \n ");
                                        break;

                                case 2:
                                        if(Books.isEmpty() && Students.isEmpty()){
                                                System.out.print("Pls create something first ;)");
                                        }else {

                                                System.out.println("Seems like you want to update a Book/Student");
                                                System.out.println("1 Book and 2 is Student");
                                                int upd = scannerVariable.nextInt();
                                                if (upd == 1) {
                                                        System.out.println(Books.toString()); // after a few tries i was able to print out my list and not only the location
                                                    // i have to change the arrayList , my idea give evry entrace a number with a for(int i =0; i < Arraylist.length ; i++);
                                                    // then choose the number , not sure how to refactor the data maybe with setMethods ? 

                                                }else {
                                                        System.out.println(Students.toString());
                                                }


                                        }
                                        break;
                                case 3:if(Books.isEmpty() && Students.isEmpty()){
                                        System.out.print("pls create something first ;)");
                                }else {


                                        System.out.println("Info about Book = 1 or Student = 2 ?  ");
                                        int IBS = scannerVariable.nextInt();
                                        if (IBS == 1) {
                                                // ausgabe von Object
                                                System.out.println(Books.toString());


                                        } else {
                                                System.out.println(Students.toString());
                                        }
                                }
                                        break;
                                case 4:System.out.println("You want to delete a Book/Student \n" + " 1 = Buch und 2 = Student" );
                                        int wasloeschen = scannerVariable.nextInt();
                                        if(wasloeschen == 1){
                                                System.out.println(Books);
                                                System.out.println("What book do you want to delete?");
                                                Books.clear();
                                                System.out.print("I will delete it for you\n");

                                        }else{
                                                System.out.println(Students);
                                                System.out.println("Which studendo you want to delete?" );
                                                Students.clear();
                                                System.out.print("I will delete him for you  \n ");
                                        }



                                        break;
                                case 5: System.out.println("You will leave the application");
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




