public class mean {
    public static double mean(double[] numbers) {
        double sum = 0.0;
        int n = numbers.length;

        for (double num : numbers) {
            sum += num;
        }

        return sum / n;
    }

    public static void main(String[] args) {
        double[] data = {10, 12, 23, 23, 16, 23, 21, 16};
        double meanValue = mean(data);
        System.out.println("Mean: " + meanValue);
    }
}   