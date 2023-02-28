package shawn.util;



public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Please enter a string: ");
        System.out.println("You entered: " + input.getString());

        System.out.print("Please enter y or n: ");
        System.out.println("You entered: " + input.yesNo());

        System.out.print("Please enter an integer between 1 and 10: ");
        System.out.println("You entered: " + input.getInt(1, 10));

        System.out.print("Please enter an integer: ");
        System.out.println("You entered: " + input.getInt());

        System.out.print("Please enter a decimal number between 1.0 and 10.0: ");
        System.out.println("You entered: " + input.getDouble(1.0, 10.0));

        System.out.print("Please enter a decimal number: ");
        System.out.println("You entered: " + input.getDouble());

        System.out.print("Please enter a  number: ");
        System.out.println("You entered: " + input.plusOne());

    }
}
