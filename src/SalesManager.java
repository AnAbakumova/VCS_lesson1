public class SalesManager {
    protected long[] sales;

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

    public long min() {
        long min = Integer.MAX_VALUE;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long truncated_mean() {
        long count = 0;
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] != max() && sales[i] != min()) {
                sum += sales[i];
                count++;
            }
        }
        return sum / count;
    }
}
