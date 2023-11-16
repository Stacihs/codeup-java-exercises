package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }


    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
//        String answer = getString();
        System.out.println("Do you live in Texas?");
        String answer = scanner.nextLine().toLowerCase();
        return answer.equals("yes") || answer.equals("y");
    }


    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userNum = scanner.nextInt();
        if (userNum > max) {
            return getInt(min, max);
        } else if (userNum < min) {
            return getInt(min, max);
        } else {
            return userNum;
        }
    }

    public int getInt() {
        return Integer.parseInt(scanner.nextLine());
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a decimal between %f and %f: ", min, max);
        double userNum = Double.parseDouble(scanner.nextLine());
        if (userNum > max) {
            return getDouble(min, max);
        } else if (userNum < min) {
            return getDouble(min, max);
        } else {
            System.out.printf("Your number is: %.2f", userNum);
        }
        return userNum;
    }

    public void getDouble() {
        System.out.print("Enter a decimal number ");
        double num = Double.parseDouble(scanner.nextLine());
        System.out.printf("Your number is %f", num);
    }

    public static void main(String[] args) {

    }
}
