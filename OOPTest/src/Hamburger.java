public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additionName1;
    private double addition1Price;

    private String additionName2;
    private double addition2Price;

    private String additionName3;
    private double addition3Price;

    private String additionName4;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.additionName1 = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.additionName2 = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.additionName3 = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.additionName4 = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll " + "with " + this.meat + ", price is " + this.price);

        if (this.additionName1 != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.additionName1 + " for an extra " + this.addition1Price);
        }
        if (this.additionName2 != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.additionName2 + " for an extra " + this.addition2Price);
        }
        if (this.additionName3 != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.additionName3 + " for an extra " + this.addition3Price);
        }
        if (this.additionName4 != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.additionName4 + " for an extra " + this.addition4Price);
        }

        return hamburgerPrice;
    }

}
