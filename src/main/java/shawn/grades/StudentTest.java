package shawn.grades;
import shawn.grades.Student;



public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John");
        student1.addGrade(80);
        student1.addGrade(90);
        student1.addGrade(85);
        System.out.println(student1.getName() + "'s average grade is " + student1.getGradeAverage());

        Student student2 = new Student("Jane");
        student2.addGrade(70);
        student2.addGrade(75);
        student2.addGrade(80);
        System.out.println(student2.getName() + "'s average grade is " + student2.getGradeAverage());
    }
}