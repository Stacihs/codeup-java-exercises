//import java.util.Scanner;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately %.2f.%n", pi);


        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
//
//        System.out.println("Enter a number:");
//        int userNum = scanner.nextInt();
//
//        System.out.printf("You entered: %d%n", userNum);

//        System.out.println("Enter three words.");
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
//        System.out.printf("%s%n %s%n %s%n", wordOne, wordTwo, wordThree);

//        System.out.println("Write a sentence.");
////        String userSentence = scanner.next();
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);

//        System.out.println("Enter the length of the classroom: ");
//        int classLength = Integer.parseInt(scanner.nextLine());
//        System.out.println("Enter the width of the classroom: ");
//        int classWidth = Integer.parseInt(scanner.nextLine());
//
//        int classArea = classLength * classWidth;
//        int classPerimeter = (classLength * 2) + (classWidth * 2);
//
//        System.out.printf("Area: %d Perimeter: %d", classArea, classPerimeter);


//        BONUS
        System.out.println("Enter the length of the classroom: ");
        float classLength = scanner.nextInt();
        System.out.println("Enter the width of the classroom: ");
        float classWidth = scanner.nextInt();
        System.out.println("Enter the height of the classroom: ");
        float classHeight = scanner.nextInt();

        float classArea = classLength * classWidth;
        float classPerimeter = (classLength * 2) + (classWidth * 2);
        float classVolume = classHeight * classLength * classWidth;

        System.out.printf("The class area is: %.2f, the class perimeter is: %.2f, and the class volume is: %.2f.", classArea, classPerimeter, classVolume);
    }
}