import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        //     the program starts executing here
//        System.out.println("Hello world");
//        System.out.print("Hello");
//        System.out.print(" World");
//        byte word = -127;
//        word += 1;
//        System.out.println(word);
//        String myString = "hi";
//        System.out.println(myString);
       int myFavoriteNumber = 23;
        System.out.println(myFavoriteNumber);
        String myString = "3.14159";
        System.out.println(myString);
        float myNumber = 3.14f;
        System.out.println(myNumber);
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        int y = 5;
//        System.out.println(++y);
//        System.out.println(y);
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);
//        int three = (int) "three";
//       System.out.println(three);
//        int x =4;
//        System.out.println(++x);
//        int x = 3;
//        int y = 4;
//        System.out.println(x * y);
//        int x = 10;
//        int y = 2;
//        System.out.println( x/y );
//        System.out.println( y-x );
//        byte newNumber = 130;
         String myName = "shawn";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        myName = input.nextLine();

        System.out.println("your name is " + myName);


        System.out.println("whats your lastname ");
       myName =input.next();
        System.out.println("your last name is " +myName );

        System.out.print("Enter your age");
        int age =  input.nextInt();
        System.out.println("Your age is " +age);

        input.close();
    }
}




