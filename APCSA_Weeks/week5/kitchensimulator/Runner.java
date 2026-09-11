public class Runner {

    public static void main(String [] args) {
        System.out.println("=== DINNER SERVICE INITIATED ===");

        Oven myOven = new Oven();
        DrinkDispenser myDispenser = new DrinkDispenser();

        myDispenser.numDrinks();
        myDispenser.checkSyrup();
        myDispenser.checkIce();
        System.out.println();


        myOven.checkTemp();
        myOven.bakePizza();
        myOven.checkTimer();

        System.out.println();
        System.out.println("=== DINNER SERVICE COMPLETE ===");
    }
}