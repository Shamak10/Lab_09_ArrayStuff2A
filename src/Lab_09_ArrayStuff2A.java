import java.util.Scanner;
public class SafeInput {
    public static int getRangedInt(Scanner pipe, String prompt, int min, int max) {
        int retInt = 0;// Declare a variable called retInt
        do {// Uses a do-while loop to prompt the user for input
            System.out.print("\n" + prompt + " : ");// Display the prompt to the user
            while (!pipe.hasNextInt()) {// Uses while Loop for invalid inputs
                System.out.print("Invalid input. " + prompt + " : ");
                pipe.next();
            }
            retInt = pipe.nextInt();// Integer value used by the user
        } while (retInt < min || retInt > max);// Checking if the integer is outside Min or Max

        pipe.nextLine();
        return retInt;
    }
}
