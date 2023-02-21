package shawn.grades;
import shawn.util.Input;

import java.util.ArrayList;


public class Student {
    private final String name;
    private final ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

    public double getGradeAverage() {
        if (this.grades.size() == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }

        return (double) sum / this.grades.size();
    }
}