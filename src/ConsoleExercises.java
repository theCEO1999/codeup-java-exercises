import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);
        Scanner sc = new Scanner(System.in);
//        sc.useDelimiter("\n");
        System.out.println("Enter an integer: ");
        int userInteger = Integer.parseInt(sc.nextLine());
        System.out.format("The integer you have entered was: %s.%n", userInteger);
        System.out.println("Enter 3 words: ");
        String firstUserInput = sc.next();
        String secondUserInput = sc.next();
        String thirdUserInput = sc.next();
        String ghost = sc.nextLine();
        System.out.printf("Your said: %n%s%n%s%n%s%n", firstUserInput, secondUserInput, thirdUserInput);
        System.out.println("Enter a sentence: ");
        String userSentence = sc.nextLine();
        System.out.format("Your sentence was: %s.%n", userSentence);
        System.out.println("What is the width of your room: ");
        double userWidth = Double.parseDouble(sc.nextLine());
        System.out.println("What is the length of your room: ");
        double userLength = Double.parseDouble(sc.nextLine());
        double userRoomArea = userLength * userWidth;
        double userRoomPerimeter = (2 * userLength + 2 * userWidth);
        System.out.format("The area of your room is %f.%n", userRoomArea);
        System.out.format("The perimeter of your room is %f.%n", userRoomPerimeter);
        System.out.println("What is the height of your room: ");
        double userRoomHeight = Double.parseDouble(sc.nextLine());
        double roomVolume = userLength * userWidth * userRoomHeight;


        System.out.print("Would you like to know the volume of the room? [y/N] ");
        String userInput = sc.next();
        boolean confirmation = userInput.equals("y");
        System.out.format("The volume of your room is %.2f%n", roomVolume);
        boolean decline = userInput.equals("N");
        System.out.println("Goodbye");
    }
}
