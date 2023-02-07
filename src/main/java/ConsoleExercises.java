import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("The value of pi is approximately " + pi);
        Scanner input = new Scanner(System.in);

//        String inputName1 = "  ";
//        String inputName2 = "  ";
//        String inputName3 = "  ";

        System.out.print("How long are the walls  ");
        int wall1 =  input.nextInt();
        int wall2 =  input.nextInt();

        System.out.println(" the perimeter of the room is  " + (wall1 *2) + (wall2 *2) );
        System.out.println(" the area of the room is  " + (wall1 *2) * (wall2 *2) );

//        System.out.println("Please write me a  3 word sentence");
//        inputName1 = input.nextLine();
//        inputName2 = input.nextLine();
//        inputName3 = input.nextLine();
//        System.out.println( inputName1 +inputName2 +inputName3);

        input.close();
    }
}

