public class Runner {

    public static void main(String[] args) {

        Car[] carArray = new Car[5];
        
        carArray[0] = new Car("Honda Civic Hatchback", 5);
        carArray[1] = new Car("Toyota Corolla Hatchback", 5);
        carArray[2] = new Car("Volkswagen Golf", 5);
        carArray[3] = new Car("Mini Cooper Hardtop", 5);
        carArray[4] = new Car("Toyota GR Yaris", 4);

        for(Car car : carArray) {
            System.out.println("\n\tThe " + car.getModel() + " has " + car.getNumDoors() + " doors.");
        }
    }
}


class Car {

    private String model;
    private int numDoors;

    public Car(String model, int numDoors) {
        this.model = model;
        this.numDoors = numDoors;
    }

    public String getModel() {
        return model;
    }

    public int getNumDoors() {
        return numDoors;
    }
}