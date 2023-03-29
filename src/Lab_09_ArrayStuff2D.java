import java.util.Arrays;
public class LinearScanD {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];//create an array of 100 integers
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = (int) (Math.random() * 100) + 1;// choose a random number between 1 and 100
        }
        System.out.println("Array: " + Arrays.toString(dataPoints));//Prints the array
        int minValue = dataPoints[0];//looks for Min value in the array
        int maxValue = dataPoints[0];//looks for the max value in the array
        for (int i = 1; i < dataPoints.length; i++) {//loop for updating min and max values
            if (dataPoints[i] < minValue) {
                minValue = dataPoints[i];
            }
            if (dataPoints[i] > maxValue) {
                maxValue = dataPoints[i];
            }
        }
        System.out.println("Minimum value in the array: " + minValue);//Prints min value
        System.out.println("Maximum value in the array: " + maxValue);//Prints max value
    }
}
