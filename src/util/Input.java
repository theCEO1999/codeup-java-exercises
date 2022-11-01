package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter your input:");
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesOrNo() {
        System.out.println("Continue? y/n: ");
        String userConfirm = scanner.nextLine();
        return userConfirm.equals("y") || userConfirm.equals("yes") || userConfirm.equals("Y") || userConfirm.equals("Yes") || userConfirm.equals("YES") || userConfirm.equals("yeah") || userConfirm.equals("yee") || userConfirm.equals("Yeah") || userConfirm.equals("Yee");
    }

    public int generateRandomNumber(int max) {
        return (int) Math.ceil(Math.random() * max);
    }

    public int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter an integer between %d and %d:%n", min, max);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.printf("You entered %d%n", userInput);
            return userInput;
        } else {
            System.out.printf("You entered %d, which is out of the range%n", userInput);
        }
        return getInteger(min, max);
    }
    public int getInt(){
        System.out.println("Enter an integer: ");
        return Integer.valueOf(getString());
    }


    public double getDouble(double min, double max){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter an number between %f and %f:%n", min, max);
        double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            System.out.printf("You entered %f%n", userInput);
            return userInput;
        } else {
            System.out.printf("You entered %f, which is out of the range%n", userInput);
        }
        return getDouble(min, max);
    }
    public double getDouble(){
        System.out.println("Enter an number:");
        return scanner.nextDouble();
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

}

