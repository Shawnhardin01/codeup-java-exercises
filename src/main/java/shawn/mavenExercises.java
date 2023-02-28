package shawn;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
public class mavenExercises {
    public static void main(String[] args) {
        String myInput;
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a String ");
        myInput = input.nextLine();
        System.out.println(myInput);
        System.out.println(" is what you enter a number:"+ StringUtils.isNumeric(myInput));
        System.out.println(StringUtils.swapCase(myInput));
        System.out.println(StringUtils.reverse(myInput));
    }
}
