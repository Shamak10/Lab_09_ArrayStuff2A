import java.util.Scanner;
public class LinearScanC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dataPoints = new int[100];
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = (int) (Math.random() * 100) + 1;
        }
        int userValue = SafeInput.getRangedInt(input, "Enter a value between 1 and 100: ", 1, 100);
        int index = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("The value " + userValue + " was not found in the array.");
        } else {
            System.out.println("The value " + userValue + " was found at array index " + index + ".");
        }
    }
}
