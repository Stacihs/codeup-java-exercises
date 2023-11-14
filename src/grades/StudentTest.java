package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student kate = new Student("Kate", new ArrayList<>());
        Student henry = new Student("Henry",new ArrayList<>());

        kate.addGrade(95);
        kate.addGrade(80);
        kate.addGrade(85);

        henry.addGrade(80);
        henry.addGrade(90);
        henry.addGrade(75);

        System.out.println(kate.getGradeAverage());
        System.out.println(henry.getGradeAverage());
    }
}
