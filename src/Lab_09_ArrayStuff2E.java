import java.util.Arrays;
public class LinearScanE {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];//created an array of 100 integers
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Array: " + Arrays.toString(dataPoints));//prints the array
        int minValue = dataPoints[0];//finds the min value
        int maxValue = dataPoints[0];//finds the max value
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < minValue) {
                minValue = dataPoints[i];
            }
            if (dataPoints[i] > maxValue) {
                maxValue = dataPoints[i];
            }
        }
        System.out.println("Minimum value in the array: " + minValue);//prints out min value
        System.out.println("Maximum value in the array: " + maxValue);//prints out max value
        double average = getAverage(dataPoints);
        System.out.println("Average of dataPoints is: " + average);//prints the average value
    }
    public static double getAverage(int[] values) {//calculates the average value
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }
}
