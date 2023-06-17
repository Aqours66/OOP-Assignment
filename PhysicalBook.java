public class PhysicalBook extends Book {
    private double weight;

    public PhysicalBook(String title, String author, double price, int quantity, double weight) {
        super(title, author, price, quantity);
        this.weight = weight;
    }

    public double calculateShippingCost() {
        double shippingCost = 4.50;
        double additionalWeight = weight - 500;

        if (additionalWeight > 0) {
            int additionalChargeUnits = (int) Math.ceil(additionalWeight / 250);
            shippingCost += additionalChargeUnits * 1.00;
        }

        return shippingCost;
    }

    public double getWeightInPounds() {
        return weight / 453.592;
    }

    // Getters and Setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}