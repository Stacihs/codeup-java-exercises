package grades;

import java.util.*;

public class GradesApplication {

    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        students.put("theonlybob", new Student("Bob", new ArrayList<>()));
        students.put("heathersheather", new Student("Heather", new ArrayList<>()));
        students.put("tonyg1", new Student("Tony", new ArrayList<>()));
        students.put("briannabri", new Student("Brianna", new ArrayList<>()));

        Student bob = students.get("theonlybob");
        Student heather = students.get("heathersheather");
        Student tony = students.get("tonyg1");
        Student brianna = students.get("briannabri");

        bob.addGrade(77);
        bob.addGrade(77);
        bob.addGrade(77);

        heather.addGrade(87);
        heather.addGrade(66);
        heather.addGrade(95);

        tony.addGrade(65);
        tony.addGrade(87);
        tony.addGrade(92);

        brianna.addGrade(87);
        brianna.addGrade(55);
        brianna.addGrade(90);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!" + "\nHere are the GitHub usernames of our students:");
        System.out.println(students.keySet());
        System.out.println("\nWhat student would you like to see more information on?");

        boolean seeAnotherStudent = true;
        while (seeAnotherStudent) {
            String key = scanner.nextLine();
            if (students.containsKey(key)) {
                Student student = students.get(key);
                System.out.printf("%s GitHub Username: %s ", student, key);
            } else {
                System.out.printf("Sorry, no student found with the Github username of \"%s\"", key);
            }

            System.out.println("Would you like to see another student? yes or no?");
            String answer = scanner.nextLine();
            if (answer.equals("no")) {
                seeAnotherStudent = false;
                System.out.println("Goodbye, and have a wonderful day!!!!!!");

            }
        }
    }
}