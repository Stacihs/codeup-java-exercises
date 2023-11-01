//import java.util.Scanner;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//
//        System.out.format("The value of pi is approximately %f%n", pi);


        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int userNum = scanner.nextInt();
//
//        System.out.format("You entered: %d%n", userNum);

//
//        System.out.print("Enter word one: ");
//        String wordOne = scanner.next();
//
//        System.out.print("Enter word two: ");
//        String wordTwo = scanner.next();
//
//        System.out.print("Enter word three: ");
//        String wordThree = scanner.next();
//
//        System.out.printf("%s%n %s%n %s", wordOne, wordTwo, wordThree);

        System.out.println("Enter the length of the classroom: ");
        int classLength = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the width of the classroom: ");
        int classWidth = Integer.parseInt(scanner.nextLine());

        int classArea = classLength * classWidth;
        int classPerimeter = (classLength * 2) + (classWidth * 2);

        System.out.printf("The class area is: %s and the class perimeter is: %s", classArea, classPerimeter);

    }
}