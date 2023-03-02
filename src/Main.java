public class Main {
    public static void main(String[] args) {
        long[] sales = {1, 20, 14, 10};

        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
        System.out.println(salesManager.truncated_mean());
    }
}
