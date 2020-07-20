public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1price;

    private String healthyExtra2Name;
    private double healthyExtra2price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1price);
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2price);
        }

        return hamburgerPrice;
    }
}
