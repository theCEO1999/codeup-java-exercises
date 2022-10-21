import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String userChoice = "y";
        while (userChoice.equals("y")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Say something to Bob: ");
            String userInput = sc.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Sure...");
            } else if (userInput.endsWith("!")) {
                System.out.println("Woah! Take it easy man...");
            } else if (userInput.isEmpty()) {
                System.out.println("Fine! Be like that then");
            } else {
                System.out.println("Whatever");

            }
            System.out.println("Got anything else to say? (y/n)");
            userChoice = sc.next();
        }


    }
}