public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int truncated_mean(){
        int count = 0;
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] != max() && sales[i] != min()){
                sum += sales[i];
                count ++;
            }
        }
        return sum/count;
    }
}
