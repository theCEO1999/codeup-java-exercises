import java.util.Scanner;

public class MethodsExercises {

    public static int adding(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public static int subtracting(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static int multiplication(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static double division(double arg1, double arg2) {
        return arg1 / arg2;
    }

    public static int modulus(int arg1, int arg2) {
        return arg1 % arg2;
    }

    public static int getInteger(int min, int max) {
        System.out.println("Please enter a number between 1 to 10: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.printf("You entered %d", userInput);
            return userInput;
        } else {
            System.out.printf("You entered %d, which is out of the range%n", userInput);
            return getInteger(1, 10);
        }
    }

    public static void factorial() {
        int userInput = getInteger(1, 10);
        while (true){
            long factorial = 1;
            for (int i = 1; i <= userInput; i++){
                factorial = factorial * i;
            }
            System.out.println(" Would you like to calculate another factorial? y/n");
            String userChoice = new Scanner(System.in).next();
            if (userChoice.equals("n")){
                break;
            } else {
                factorial();
            }
        }
    }

//    class PairOfDice {
//
//        private int die1;   // Number showing on the first die.
//        private int die2;   // Number showing on the second die.
//
//        public PairOfDice() {
//            // Constructor.  Rolls the dice, so that they initially
//            // show some random values.
//            roll();  // Call the roll() method to roll the dice.
//        }

    public static void Dice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many sides the dice should have: ");
        int UserInt = sc.nextInt();
        System.out.println("Your dice have " + UserInt + " sides");
        System.out.println("Do you want to roll the dice? y/n");
        String userChoice = sc.next();
        if (userChoice.equals("y")){
            System.out.println("You rolled the dice...");
            int die1 = (int) (Math.random() * UserInt) + 1;
            int die2 = (int) (Math.random() * UserInt) + 1;
            System.out.printf("Dice#1 rolled %d and Dice#2 rolled %d", die1, die2);
        }
    }


//    public static void HigherOrLower(){
//        Scanner sc = new Scanner(System.in);
//        int RandomNum = (int) (Math.random() *100) + 1;
//        System.out.println("random number is "+ RandomNum);
//        System.out.println("I have generated a random number between 1 and 100. Guess it: ");
//        int userGuess = sc.nextInt();
//        System.out.println("You guessed " + userGuess);
//        if (userGuess.equals(RandomNum)){
//            System.out.println("You guessed it!");
//        } else {
//            HigherOrLower();
//        }
//
//    }

//        public static void roll() {
//            // Roll the dice by setting each of the dice to be
//            // a random number between 1 and 6.
//            die1 = (int) (Math.random() * UserInt) + 1;
//            die2 = (int) (Math.random() * UserInt) + 1;
//        }
//
//        public int getDie1() {
//            // Return the number showing on the first die.
//            return die1;
//        }
//
//        public int getDie2() {
//            // Return the number showing on the second die.
//            return die2;
//        }
//
//        public int getTotal() {
//            // Return the total showing on the two dice.
//            return die1 + die2;
//        }
//
//    }  // end class PairOfDice


    public static void main(String[] args) {
//        System.out.println(adding(15, 20));
//        System.out.println(subtracting(15, 20));
//        System.out.println(multiplication(15, 20));
//        System.out.println(division(20, 15));
//        System.out.println(modulus(20, 15));
//        factorial();
//        Dice();
//        HigherOrLower();

//            getInteger(1, 10);

//        PairOfDice dice;          // A variable that will refer to the dice.
//        int rollCount;    // Number of times the dice have been rolled.
//
//        dice = new PairOfDice();  // Create the PairOfDice object.
//        rollCount = 0;
//
//        /* Roll the dice until they come up snake eyes. */
//
//        do {
//            dice.roll();
//            System.out.println("The dice come up " + dice.getDie1()
//                    + " and " + dice.getDie2());
//            rollCount++;
//        } while (dice.getTotal() != 2);
//
//        /* Report the number of rolls. */
//
//        System.out.println("\nIt took " + rollCount + " rolls to get a 2.");


    }  // end class RollFor2


//
//        System.out.println("Please enter an integer from 1 to 10: ");
//        Scanner sc = new Scanner(System.in);
//        int userInt = sc.nextInt();
//        System.out.println("The number you entered is " +  userInt + " continue?(y/n)");
//        String userConfirm = sc.next();
//        Boolean confirmation =  userConfirm.equals("y");


//        public static int getInteger(int min, int max){
//
//
//        }


    //
//        System.out.println("Please enter a number: ");
//        int userArg1 = sc.nextInt();
//        System.out.println("Please enter another number: ");
//        int userArg2 = sc.nextInt();
//        System.out.println("Would you like to add the two numbers together? (y/n)");
//        String userConfirm = sc.next();
//        boolean confirmation = userConfirm.equals("y");
//        boolean decline = userConfirm.equals("n");
//        if (confirmation) {
//            System.out.println(userArg1 + userArg2);
//
//        } else if (decline) {
//            System.out.println("Would you like to subtract the two numbers? (y/n)");
//            String userConfirm2 = sc.next();
//            boolean confirmation2 = userConfirm2.equals("y");
//            boolean decline2 = userConfirm2.equals("n");
//            if (confirmation2) {
//                System.out.println(userArg1 - userArg2);
//            } else if (decline2) {
//                System.out.println("Would you like to multiply the two numbers together? (y/n)");
//                String userConfirm3 = sc.next();
//                boolean confirmation3 = userConfirm3.equals("y");
//                boolean decline3 = userConfirm3.equals("n");
//                if (confirmation3) {
//                    System.out.println(userArg1 * userArg2);
//                } else if (decline3) {
//                    System.out.println("Would you like to divide the two numbers? (y/n)");
//                    String userConfirm4 = sc.next();
//                    boolean confirmation4 = userConfirm4.equals("y");
//                    boolean decline4 = userConfirm4.equals("n");
//                    if (confirmation4) {
//                        System.out.println(userArg1 / userArg2);
//                    } else if (decline4) {
//                        System.out.println("ok ok bye then...");
//                    }
//                }
//            }
//                public static void main(String[] args)
//            {
//                    System.out.println("Please enter an integer between one and ten: ");
//                    Scanner sc = new Scanner(System.in);
//                    int userInt = sc.nextInt();
//                }
//            }
//        }


//        public static int adding(int arg1, int arg2){
//            return arg1 + arg2;
//            System.out.println(arg1 + arg2);
//        }
//        public static int subtraction(int arg1, arg2){
//            System.out.println(arg1 - arg2);
//        }
//        public static int multiplication(int arg1, arg2){
//            System.out.println(arg1 * arg2);
//        }
//        public static int division(arg1, arg2){
//            System.out.println(arg1 / arg2);
//        }


    }

