import java.util.Random;
import java.util.Scanner;
public class LinearScanB {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];// Created an array of 100 integers
        Random rand = new Random();
        for (int i = 0; i < dataPoints.length; i++) {//generates a random number between 1 to 100 
            dataPoints[i] = rand.nextInt(100) + 1;
        }
        Scanner sc = new Scanner(System.in);//Asking the user to select a number between 1 and 100
        int userValue = SafeInput.getRangedInt(sc, "Enter an integer between 1 and 100: ", 1, 100);
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {//Counting the number of times the users number appears
                count++;
            }
        }
        System.out.println("The value " + userValue + " was found " + count + " times in the array.");// Gives you the result
    }
}
