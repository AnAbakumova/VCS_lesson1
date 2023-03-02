public class Main {
    public static void main(String[] args) {
        int[] sales = {1, 20, 16, 10};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
        System.out.println(salesManager.truncated_mean());
    }
}
