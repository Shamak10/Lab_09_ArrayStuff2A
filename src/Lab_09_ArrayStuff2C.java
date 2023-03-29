import java.util.Scanner;
public class LinearScanC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dataPoints = new int[100];// Create an array of 100 integers
        for (int i = 0; i < dataPoints.length; i++) {//array chooses randon integer between 1 and 100
            dataPoints[i] = (int) (Math.random() * 100) + 1;
        }
        int userValue = SafeInput.getRangedInt(input, "Enter a value between 1 and 100: ", 1, 100);//ask the user to enter an integer between 1 and 100
        int index = -1;
        for (int i = 0; i < dataPoints.length; i++) {//Loop to find users value
            if (dataPoints[i] == userValue) {
                index = i;
                break;
            }
        }
        if (index == -1) {//prints the output 
            System.out.println("The value " + userValue + " was not found in the array.");
        } else {
            System.out.println("The value " + userValue + " was found at array index " + index + ".");
        }
    }
}
