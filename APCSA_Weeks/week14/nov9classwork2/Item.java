public class Item {

    // declare private instance variables
    private String name;
    private double price;


    public Item(String name, double price) {
        // initialize the variables with parameters
        this.name = name;
        this.price = price;
    }

    // method that returns this.name
    public String getName() {
        return name;
    }

    // method that returns this.price
    public double getPrice() {
        return price;
    }
}