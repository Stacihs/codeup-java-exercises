package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    @Override
    public String toString() {
        return "Student " +
                "Name: " + name +
                ", Grades: " + grades +
                ", Current Average: " + getGradeAverage();
    }

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }
    public double getGradeAverage(){
        int average = 0;
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
             sum += grades.get(i);
             average = sum / grades.size();
        }
        return average;
    }

    public static void main(String[] args) {

    }
}
