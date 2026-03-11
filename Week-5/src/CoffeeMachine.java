public class CoffeeMachine {
    private String model;
    private double price;
    private int waterLevel;
    public static double tax = 0.2;

    public CoffeeMachine(String model, double price, int waterLevel) {
        this.model = model;
        setPrice(price);
        this.waterLevel = waterLevel;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative! Setting price to 0.");
            this.price = 0;
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void addWater(int amount) {
        if (amount > 0) {
            waterLevel += amount;
            System.out.println("Added " + amount + "ml of water. Current water level: " + waterLevel + "ml");
        } else {
            System.out.println("Cannot add negative amount of water!");
        }
    }

    public void makeCoffee() {
        if (waterLevel >= 200) {
            waterLevel -= 200;
            System.out.println("Coffee is ready! Enjoy your drink!");
            System.out.println("Price: $" + (price + price * tax));
        } else {
            System.out.println("Not enough water! Please refill.");
        }
    }

    @Override
    public String toString() {
        return "CoffeeMachine{model='" + model + "', price=$" + price + ", waterLevel=" + waterLevel + "ml}";
    }
}

