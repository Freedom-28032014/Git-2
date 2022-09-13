public class SalesManager {
    protected static long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min(long max) {
        long min = Integer.MAX_VALUE;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long mediumCropped() {
        long sum = 0;
        for (long s : sales) {
            sum += s;
        }
        if (sales.length == 1) {
            return sum;
        }
        if (sales.length == 2) {
            return sum / 2;
        }
        return ((sum - (max() + min(max()))) / (sales.length - 2));

    }
}
