import java.util.Scanner;

//public class MethodsExercises {

//    public static int add(int numOne, int numTwo) {
//        return numOne + numTwo;
//    }
//
//    public static int subtract(int numOne, int numTwo) {
//        return numOne - numTwo;
//    }
//
//    public static int multiply(int numOne, int numTwo) {
//        return numOne * numTwo;
//    }
//
//    public static int divide(int numOne, int numTwo) {
//        return numOne / numTwo;
//    }
//
//    public static int remainder(int numOne, int numTwo) {
//        return numOne % numTwo;
//    }

//    public static int getInteger(int min, int max) {
//        System.out.printf("Enter a number between %d and %d: ", min, max);
//        Scanner scanner = new Scanner(System.in);
//        int userNum = Integer.parseInt(scanner.nextLine());
//        if (userNum > max) {
//            return getInteger(min, max);
//        } else if (userNum < min) {
//            return getInteger(min, max);
//        } else {
//            return userNum;
//        }
//    }

//    public static long factorial(int num) {
//        Scanner scanner = new Scanner(System.in);
////        System.out.println("Enter a number from 1 to 10");
////        num = Integer.parseInt(scanner.nextLine());
//        long factorial = 0;
//        if (num >= 1 && num <= 10) {
//            factorial = 1;
//            if (num == 1 || num == 2) {
//                return num;
//            } else {
//                for (int i = 1; i < num; i++) {
//                    factorial = factorial * i;
//                }
//            }
//        }
//        return factorial;
//    }
//        public static int rollDice(int side1, int side2) {
//            System.out.println("Enter the number of sides of a pair of dice");
//            Scanner scanner = new Scanner(System.in);
//            scanner.useDelimiter("\n");
//            System.out.println("Roll the dice!");
//            int diceSides1 = Integer.parseInt(scanner.nextLine());
//            int diceSides2 = Integer.parseInt(scanner.nextLine());
//
//
//        }


//    public static void main(String[] args) {
////        System.out.println(add(1, 99));
//////        System.out.println(multiply(4, 8));
//////        System.out.println(subtract(25, 5));
//////        System.out.println(divide(24, 6));
//////        System.out.println(mod(20, 7));
//////        System.out.println(getInteger(5, 24));
//        System.out.println(factorial(4));
//    }
//
//}

//        return a random #between low and high INCLUSIVE
//            (int) Math.floor(Math.random() * (high - low + 1) + low);
//            System.out.println("Do you want to roll again?");
