import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", + pi);

        Scanner input = new Scanner(System.in);

        String inputName1 = "  ";
        String inputName2 = "  ";
        String inputName3 = "  ";

        System.out.println("Please write me a  3 word sentence");
        inputName1 = input.nextLine();
        inputName2 = input.nextLine();
        inputName3 = input.nextLine();
        System.out.printf( "%s%n%s%n%s%n",inputName1,inputName2,inputName3);


        System.out.println("How long are the walls  ");
        System.out.println("What is the length");
        String str = input.nextLine();
        double wall1 =  Double.parseDouble(str);
        System.out.println("What is the Width");
        str = input.nextLine();
        double wall2 =  Double.parseDouble(str);
        System.out.println("What is the height");
        str = input.nextLine();
        double wall3 =  Double.parseDouble(str);


        System.out.println(" The  area of the room is  " + (wall1  *  wall2) );
        System.out.println(" The perimeter of the room is  " + (wall1 *2 + wall2 *2) );
        System.out.println(" The volume of the room is  " + (wall1  *  wall2 * wall3) );



        input.close();

    }
}

