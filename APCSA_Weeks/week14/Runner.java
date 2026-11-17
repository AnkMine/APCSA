// this class creates an array of Car objects and prints the model and number of doors of each car
public class Runner {

    // main method
    public static void main(String[] args) {

        // creating a Car array with 5 slots
        Car[] carArray = new Car[5];
        
        // creating a Car object in each slot of carArray using the initialization constructor from Car.java
        carArray[0] = new Car("Honda Civic Hatchback", 5);
        carArray[1] = new Car("Toyota Corolla Hatchback", 5);
        carArray[2] = new Car("Volkswagen Golf", 5);
        carArray[3] = new Car("Mini Cooper Hardtop", 5);
        carArray[4] = new Car("Toyota GR Yaris", 4);

        // for-each loop that prints the model and number of doors of each car
        for(Car car : carArray) {
            System.out.println("\n\tThe " + car.getModel() + " has " + car.getNumDoors() + " doors.");
        }
    }
}


// car class with model and number of doors
class Car {

    // instance variables
    private String model;
    private int numDoors;

    // initialization constructor that sets the model and numDoors instance variables
    public Car(String model, int numDoors) {
        this.model = model;
        this.numDoors = numDoors;
    }

    // methods that return the instance variables
        public String getModel() {
            return model;
        }

        public int getNumDoors() {
            return numDoors;
        }
}