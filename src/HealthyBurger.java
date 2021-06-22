public class HealthyBurger extends Hamburger{
    private String extraName1;
    private double extraPrice1;

    private String extraName2;
    private double extraPrice2;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, "Brown Rye", price);
    }

    public void addHealthyAdd1(String name, double price){
        this.extraName1 = name;
        this.extraPrice1 = price;

    }
    public void addHealthyAdd2(String name, double price){
        this.extraName2 = name;
        this.extraPrice2 = price;
    }

    @Override
    public double itemizeHamburger() {
        //this is calling the itemize method in the base class (Hamburger):
        double burgerPrice = super.itemizeHamburger();
        if(this.extraName1 != null){
            burgerPrice += this.extraPrice1;
            System.out.println("Added " + this.extraName1 + " for an extra " + this.extraPrice1);
        }
        if(this.extraName2 != null){
            burgerPrice += this.extraPrice2;
            System.out.println("Added " + this.extraName2 + " for an extra " + this.extraPrice2);
        }

        return burgerPrice;
    }
}
