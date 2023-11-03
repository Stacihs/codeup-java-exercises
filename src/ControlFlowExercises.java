import java.util.Objects;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.format("%d%n",i);
//            i += 2;
//        }
//        while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        }
//        while (i >= -10);


//        long i = 2;
//        do {
//            System.out.println(i);
//            i = i * i;
//        }
//        while (i < 1000000);


//        for(int i = 100; i >= -10; i-=5) {
//            System.out.println(i);
//        }

//        for(long i = 2; i <= 100000; i = i * i) {
//            System.out.println(i);
//        }


//        for (int i = 1; i <= 100; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("FizzBuzz");
//                continue;
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//                continue;
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//                continue;
//            } else {
//                System.out.println(i);
//            }
//        }


        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a Number");
//        int userNum = scanner.nextInt();
//        System.out.println("Do you want to keep going?");
//        String userAnswer = scanner.next().toLowerCase();
//        String answer = "yes";
//        if (Objects.equals(userAnswer, answer)) {
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userNum; i++) {
//                int square = i * i;
//                int cube = i * square;
//                System.out.printf("%-7d| %-8d| %-7d%n", i, square, cube);
//            }
//        } else {
//            System.out.println("Bye!");
//        }

        System.out.println("Enter a grade from 0 to 100");
        int numGrade = scanner.nextInt();
        System.out.println("Do you want to keep going? Yes or No.");
        String userAnswer = scanner.next().toLowerCase();
        if (userAnswer.equals("yes")) {
            if (numGrade >= 0 && numGrade < 60) {
                System.out.print('F');
            } else if (numGrade >= 60 && numGrade < 67) {
                System.out.print('D');
            } else if (numGrade >= 67 && numGrade < 79) {
                System.out.print('C');
            } else if (numGrade >= 80 && numGrade < 88) {
                System.out.print('B');
            } else if (numGrade >= 88 && numGrade < 101) {
                System.out.print('A');
            }
        } else {
            System.out.println("Bye!");
        }
    }
}

