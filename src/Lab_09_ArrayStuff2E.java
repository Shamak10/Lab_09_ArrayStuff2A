import java.util.Arrays;
public class LinearScanE {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Array: " + Arrays.toString(dataPoints));
        int minValue = dataPoints[0];
        int maxValue = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < minValue) {
                minValue = dataPoints[i];
            }
            if (dataPoints[i] > maxValue) {
                maxValue = dataPoints[i];
            }
        }
        System.out.println("Minimum value in the array: " + minValue);
        System.out.println("Maximum value in the array: " + maxValue);
        double average = getAverage(dataPoints);
        System.out.println("Average of dataPoints is: " + average);
    }
    public static double getAverage(int[] values) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }
}
