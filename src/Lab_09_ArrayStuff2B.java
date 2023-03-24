import java.util.Random;
import java.util.Scanner;
public class LinearScanB {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }
        Scanner sc = new Scanner(System.in);
        int userValue = SafeInput.getRangedInt(sc, "Enter an integer between 1 and 100: ", 1, 100);
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " was found " + count + " times in the array.");
    }
}
