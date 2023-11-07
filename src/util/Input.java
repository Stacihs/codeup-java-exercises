package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public void getScanner() {
        new Scanner(System.in);
    }

//    public void setScanner(Scanner scanner) {
//        this.scanner = scanner;
//    }
    public void setScanner() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Write a short sentence.");
        String str = scanner.nextLine();
        System.out.printf("%s%n", str);
        return str;
    }

    public boolean yesNo() {
        System.out.println("Do you live in Texas?");
        String answer = scanner.nextLine();
        return answer.equals("yes");
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userNum = Integer.parseInt(scanner.nextLine());
        if (userNum > max) {
            return getInt(min, max);
        } else if (userNum < min) {
            return getInt(min, max);
        } else {
            return userNum;
        }
    }

    public int getInt() {
        System.out.println("Enter a number");
        int inputNum = Integer.parseInt(scanner.nextLine());
        System.out.print("Your number is:");
        return inputNum;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a decimal between %f and %f: ", min,  max);
        double userNum = Double.parseDouble(scanner.nextLine());
        if (userNum > max) {
            return getDouble(min, max);
        } else if (userNum < min) {
            return getDouble(min, max);
        } else {
            System.out.print("Your number is:");
        }
        return userNum;
    }

    public void getDouble(){
        System.out.print("Enter a decimal number ");
        double num = Double.parseDouble(scanner.nextLine());
        System.out.printf("Your number is %f", num);
    }
}
