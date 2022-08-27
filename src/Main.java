public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{});
        long max = salesManager.max();
        System.out.println(max);
        long min = salesManager.min(max);
        long sum = 0;
        for (long s : salesManager.sales) {
            sum += s;
        }
        long length = salesManager.sales.length;
        System.out.println(mediumCropped(min, max, sum, length));
    }

    public static long mediumCropped(long max, long min, long sum, long length) {
        if (length == 1) {
            return sum;
        }
        if (length == 2) {
            return sum / 2;
        }
        return (sum - (max + min)) / (length - 2);
    }

}