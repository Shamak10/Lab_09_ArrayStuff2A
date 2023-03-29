import java.util.Scanner;

public class Linear_Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//asking the user for the input
        int userInput = SafeInput.getRangedInt(scanner, "Please enter an integer between 1 and 100", 1, 100);// Select a number between 1 and 100
        System.out.println("You entered: " + userInput);// prints the users input
        scanner.close();
    }
}
