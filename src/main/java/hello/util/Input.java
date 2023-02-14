package hello.util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.next().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(int min, int max) {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(scanner.next());
                if (input >= min && input <= max) {
                    break;
                }
            } catch (NumberFormatException e) {}
            System.out.printf("Please enter an integer between %d and %d: ", min, max);
        }
        return input;
    }

    public int getInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {}
            System.out.print("Please enter an integer: ");
        }
    }

    public double getDouble(double min, double max) {
        double input;
        while (true) {
            try {
                input = Double.parseDouble(scanner.next());
                if (input >= min && input <= max) {
                    break;
                }
            } catch (NumberFormatException e) {}
            System.out.printf("Please enter a decimal number between %f and %f: ", min, max);
        }
        return input;
    }

    public double getDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {}
            System.out.print("Please enter a decimal number: ");
        }
    }
}

