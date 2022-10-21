import java.util.Scanner;

public class ControlStatementsLecture {
    public static void main(String[] args) {
        int myInteger = 20;
        int x = 6;
        if (x == 5){
            System.out.println("x is 5");
        } else if (x > 5 && x < 15){
            System.out.println("x is between 5 and 15");
        } else {

        }

        String customerChoice;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What flavor do you want: ");
        customerChoice = scanner.next();
        // enhanced switch case
        switch (customerChoice) {
            case "vanilla" -> System.out.println("One vanilla coming right up");
            case "chocolate" -> System.out.println("chocolate coming right up");
            case "strawberry" -> System.out.println("strawberry coming right up");
            default -> System.out.println("We don't have that");

//        switch (customerChoice) {
//            case "vanilla":
//                System.out.println("One vanilla coming right up");
//                break;
//            case "chocolate":
//                System.out.println("chocolate coming right up");
//                break;
//            case "strawberry":
//                System.out.println("strawberry coming right up");
//                break;
//            default:
//                System.out.println("We don't have that");
//                break;


        }

    }
}
