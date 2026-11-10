// candy class with type and size
public class Candy {

    // declare private instance variables
    private String type;
    private double size;

    // initialization constructor
    public Candy(String type, double size) {
        this.type = type;
        this.size = size;
    }

    // method that returns this.type
    public String getType() {
        return type;
    }

    // method that returns this.size
    public double getSize() {
        return size;
    }
}