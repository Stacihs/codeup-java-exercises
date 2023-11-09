import java.util.Scanner;

public class MethodsExercises {

    public static int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static int subtract(int numOne, int numTwo) {
        return numOne - numTwo;
    }

    public static int multiply(int numOne, int numTwo) {
        return numOne * numTwo;
    }

    public static int divide(int numOne, int numTwo) {
        return numOne / numTwo;
    }

    public static int remainder(int numOne, int numTwo) {
        return numOne % numTwo;
    }

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

    public static long factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10");
        long num = scanner.nextInt();
        System.out.println("Do you want to keep going? Yes or No.");
        String userAnswer = scanner.next().toLowerCase();
        long fact = 0;
        if (userAnswer.equals("yes")) {
            if (num != 1 && num != 2) {
                fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
            }
            return fact;
        } else {
            System.out.println("See ya!");
        }
        return fact;
    }

    public static int diceRoll(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public static void playDice() {
        System.out.println("Enter the number of sides for a pair of dice");
        Scanner scanner = new Scanner(System.in);
        int sides = scanner.nextInt();
        System.out.println("Roll the dice!");
        int die1 = diceRoll(1, sides);
        int die2 = diceRoll(1, sides);

        System.out.printf("You rolled a %d and a %d%n", die1, die2);
        System.out.println("Would you like to roll again? Yes or No");
        scanner.nextLine();
        String answer = scanner.nextLine().toLowerCase();
        if (answer.equals("yes")) {
            playDice();
        } else {
            System.out.println("See you next time!");
        }
    }





    public static void main(String[] args) {
//        System.out.println(add(1, 99));
//        System.out.println(multiply(4, 8));
//        System.out.println(subtract(25, 5));
//        System.out.println(divide(24, 6));
//        System.out.println(mod(20, 7));
//        System.out.println(getInteger(5, 24));
//        System.out.println(factorial());
        System.out.println(playDice());
    }

}
