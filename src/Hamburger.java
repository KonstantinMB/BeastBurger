public class Hamburger {
    private String name;
    private String meat;
    private String breadType;
    private double price;

    private String additionalName1;
    private double additionalPrice1;

    private String additionalName2;
    private double additionalPrice2;

    private String additionalName3;
    private double additionalPrice3;

    private String additionalName4;
    private double additionalPrice4;

    public Hamburger(String name, String meat, String breadType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadType = breadType;
        this.price = price;
    }

    public void addHamburgerAdd1(String name, double price) {
        this.additionalName1 = name;
        this.additionalPrice1 = price;
    }
    public void addHamburgerAdd2(String name, double price) {
        this.additionalName2 = name;
        this.additionalPrice2 = price;
    }
    public void addHamburgerAdd3(String name, double price) {
        this.additionalName3 = name;
        this.additionalPrice3 = price;
    }
    public void addHamburgerAdd4(String name, double price) {
        this.additionalName4 = name;
        this.additionalPrice4 = price;
    }

    public double itemizeHamburger(){
        //the current price of the burger
        double burgerPrice = this.price;
        System.out.println(this.name + " hamburger " + "on a " + this.breadType + " roll with " + this.meat + " is at price: " + this.price);
        if(this.additionalName1 != null){
            burgerPrice += this.additionalPrice1;
            System.out.println("Added " + this.additionalName1 + " for an extra " + this.additionalPrice1);
        }
        if(this.additionalName2 != null){
            burgerPrice += this.additionalPrice2;
            System.out.println("Added " + this.additionalName2 + " for an extra " + this.additionalPrice2);
        }
        if(this.additionalName3 != null){
            burgerPrice += this.additionalPrice3;
            System.out.println("Added " + this.additionalName3 + " for an extra " + this.additionalPrice3);
        }
        if(this.additionalName4 != null){
            burgerPrice += this.additionalPrice4;
            System.out.println("Added " + this.additionalName4 + " for an extra " + this.additionalPrice4);
        }

        return burgerPrice;
    }
}
