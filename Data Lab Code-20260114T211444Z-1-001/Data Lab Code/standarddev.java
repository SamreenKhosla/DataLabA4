public class standarddev {
    public static double standardDeviation(double[] numbers) {
        double sum = 0.0;
        double mean;
        double squaredDifferenceSum = 0.0;
        int n = numbers.length;

        for (double num : numbers) {
            sum += num;
        }
        mean = sum / n;

        for (double num : numbers) {
            squaredDifferenceSum += Math.pow(num - mean, 2);
        }

        return Math.sqrt(squaredDifferenceSum / n);
    }

    public static void main(String[] args) {
        double[] data = {10, 12, 23, 23, 16, 23, 21, 16};
        double stdDev = standardDeviation(data);
        System.out.println("Standard Deviation: " + stdDev);
    }
}
