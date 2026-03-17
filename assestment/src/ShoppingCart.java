public class ShoppingCart {
    private String[] itemNames;
    private double[] prices;
    private int itemCount;
    private static double globalDiscount = 0.01;

    public ShoppingCart(int capacity) {
        itemNames = new String[capacity];
        prices = new double[capacity];
        itemCount = 0;
    }

    public boolean addItem(String name, double price) {
        if (itemCount < itemNames.length) {
            itemNames[itemCount] = name;
            prices[itemCount] = price;
            itemCount++;
            return true;
        }
        return false;
    }

    public static void setDiscount(double discount) {
        if (discount >= 0.0 && discount <= 1.0) {
            globalDiscount = discount;
        }
    }

    public double calculateTotal() {
        double sum = 0.0;
        for (int i = 0; i < itemCount; i++) {
            sum = sum + prices[i];
        }
        return sum * (1.0 - globalDiscount);
    }
}