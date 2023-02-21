package shawn.grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student mike = new Student("Mike");
        mike.addGrade(80);
        mike.addGrade(60);
        mike.addGrade(76);

        Student chet = new Student("Chet");
        chet.addGrade(100);
        chet.addGrade(100);
        chet.addGrade(90);

        Student lester = new Student("Lester");
        lester.addGrade(90);
        lester.addGrade(100);
        lester.addGrade(98);

        Student mary = new Student("Mary");
        mary.addGrade(80);
        mary.addGrade(95);
        mary.addGrade(85);

        students.put("Mikewashere", mike);
        students.put("big-betChet", chet);
        students.put("lesthebestpaul", lester);
        students.put("Marry<3les", mary);

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);

         {
            System.out.println("What student would you like to see more information on?");
            String input = scanner.nextLine();

            if (!students.containsKey(input)) {
                System.out.println("\nSorry, no student found with the GitHub username of \"" + input + "\".\n");
            } else {
                Student student = students.get(input);
                System.out.println("\nName: " + student.getName() + " - GitHub Username: " + input);
                System.out.println("Current Average: " + student.getGradeAverage() + "\n");
            }

            System.out.println("Would you like to see another student? (y/n)");
            String choice = scanner.nextLine().toLowerCase();

            if (!choice.equals("y")) {
                System.out.println("What student would you like to see more information on?");
                input = scanner.nextLine();

            }
            else {
                System.out.println("bye");
            }
        }
    }
}
