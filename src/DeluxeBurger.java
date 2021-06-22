public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "Italian Sausage & Bacon", "Wholegrain", 15.49);
        super.addHamburgerAdd1("Chips", 2.99);
        super.addHamburgerAdd1("Drink", 1.99);
    }

    //These overriding methods are in order to stop the user from adding items/ingredients to the Deluxe Burger
    @Override
    public void addHamburgerAdd1(String name, double price) {
        System.out.println("Cannot add additional ingredients to the Deluxe Burger");
    }

    @Override
    public void addHamburgerAdd2(String name, double price) {
        System.out.println("Cannot add additional ingredients to the Deluxe Burger");
    }

    @Override
    public void addHamburgerAdd3(String name, double price) {
        System.out.println("Cannot add additional ingredients to the Deluxe Burger");
    }

    @Override
    public void addHamburgerAdd4(String name, double price) {
        System.out.println("Cannot add additional ingredients to the Deluxe Burger");
    }
}
