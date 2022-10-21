import java.util.*;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//        // for loop version of the loop above
//        for (int k=5; k<=15;k++){
//            System.out.println(k);
//        }
//        //
//        int num = 100;
//        do {
//            System.out.println(num);
//            num -= 5;
//        } while (num >= -10);
//        // for loop version of the loop above
//        for (int f = 100; f >= -10; f-=5){
//            System.out.println(f);
//        }
//        //
//        long num2 = 2;
//        do {
//            System.out.println(num2);
//            num2 = num2 * num2;
//        } while (num2 <= 1000000);
//        // for loop version of the loop above
//        for (long num3 = 2; num3 <= 1000000; num3 = num3 * num3){
//            System.out.println(num3);
//        }
//        // fizzbuzz
//        int d = 1;
//        do {
//            d++;
//            if (d %3 == 0 && d %5 == 0){
//                System.out.println("FizzBuzz");
//            } else if (d %3 == 0){
//                System.out.println("Fizz");
//            } else if (d %5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(d);
//            }
//        } while (d < 100);
//        //
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter an integer: ");
//        int userInt = sc.nextInt();
//        System.out.format("Would you like me to display a table showing the squares and cubes from 1 to %s? [y/N]", userInt);
//        String userInput = sc.next();
//        if (userInput.equals("y")){
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int l = 1; l <= userInt; l++){
//                System.out.printf("%-7d| %-8d| %-5d%n", l, l*l, l*l*l);
//            }
//
//        } else if (userInput.equals("N")){
//            System.out.println("ok goodbye...");
//        }
//        //
//        System.out.println("Please enter a numerical grade from 1 to 100: ");
//        int userGrade = sc.nextInt();
//        if (userGrade >= 88){
//            System.out.println("You have an A! :) ");
//        } if (userGrade >= 80 & userGrade < 88) {
//            System.out.println("You have a B! :o ");
//        } if (userGrade >= 67 & userGrade < 80) {
//            System.out.println("You have a C :| ");
//        } if (userGrade >= 60 & userGrade < 66){
//            System.out.println("You have a D :/ ");
//        } if (userGrade < 60) {
//            System.out.println("Your failing... :( ");
//        }


        String userChoice = "y";
        while (userChoice.equals("y")){
            System.out.println("Enter a numerical grade from 0 to 100:");
            Scanner scanner = new Scanner(System.in);
            byte grade = scanner.nextByte();
            char letterGrade;
            if (grade <= 59){
                letterGrade = 'F';
            } else if (grade <= 66){
                letterGrade = 'D';
            } else if (grade <= 79) {
                letterGrade = 'C';
            } else if (grade <= 87) {
                letterGrade = 'B';
            } else {
                letterGrade = 'A';
            }
            System.out.println("The letter grade is " + letterGrade);
            System.out.println("Would you like to enter another grade? y/n");
            userChoice = scanner.next();
        }



    }
}
