// virtual pet class with pet stats and actions
public class Pet {

    // instance variables
    private String name, species, strIsSleeping;
    private int hunger, happiness;
    private boolean isAsleep;

    // initialization constructor
    Pet(String name, String species, int hunger, int happiness, boolean isAsleep) {
        this.name = name;
        this.species = species;
        this.hunger = hunger;
        this.happiness = happiness;
        this.isAsleep = isAsleep;
        
    }

    // keeps hunger and happiness within 0-100
    private void clampStats() {
        // checks if hunger is below or above the allowed range
        if (hunger < 0) {
            hunger = 0;
        } else if(hunger > 100) { 
            hunger = 100;
        }

        // checks if happiness is below or above the allowed range
        if (happiness < 0) {
            happiness = 0;
        } else if(happiness > 100) { 
            happiness = 100;
        }

    }

    // method that takes pet on a walk if stats allow it
    public void goOnWalk(int miles) {
        // checks if pet is awake and has room for walk stat changes
        if (!isAsleep && hunger <= 70 && happiness < 90) {
            System.out.println("\n" + makeBold(name) + " is going on a walk!\n");
            
            happiness += miles * 3;
            hunger += miles * 5;
        
            clampStats();

            System.out.println(makeBold(name) + " went on a " + makeBold(miles + "") + " mile walk and loved the outdoors!");

        } else {
            
            // prints the reason the walk was blocked
            if (isAsleep) {
                System.out.println(makeBold(name) + " did not go on a walk because they were sleeping.");
            } else if(hunger > 70) {
                System.out.println(makeBold(name) + " did not go on a walk because they were too hungry.");
            } else {
                System.out.println(makeBold(name) + " did not go on a walk because they were too happy.");
            }
        }

    }

    // method that feeds pet and lowers hunger if awake
    public void feed(int decStep) {
        // checks if pet is awake before feeding
        if (!isAsleep) {
            hunger -= decStep * 3;
            clampStats();

            System.out.println("\n" + makeBold(name) +  " ate some food!");
        } else {
            System.out.println("\n" + makeBold(name) + " will not eat as they are sleeping. Don't disturb them!");
        }
    }

    // method that plays with pet and returns whether play happened
    public boolean play(int ascStep) {
        // checks if pet is too tired or too hungry to play
        if (isAsleep || hunger > 80) {
            return false;
        } else {
            happiness += ascStep;
            hunger += 0.5 * ascStep;

            clampStats();
            return true;
        }
    }

    // toggles isAsleep between true and false
    public void toggleSleep() {
        isAsleep = !isAsleep;

        // sets sleeping text for status message
        if (isAsleep) { 
            strIsSleeping = "";
        } else {
            strIsSleeping = "NOT";
        }

        System.out.println("Now, your pet is " + makeBold(strIsSleeping) + " sleeping.");
    }

    // checks if pet needs care based on stats
    public boolean needsCare() {
        // returns true when hunger is high or happiness is low
        if (hunger > 70 || happiness < 50) {
            return true;
        } else {
            return false;
        }
    }

    // builds and returns the pet status string
    public String getStatus() {
        
        // sets yes/no text for sleep question
        if (isAsleep) { 
            strIsSleeping = " yes";
        } else {
            strIsSleeping = " no";
        }
        
        return "\nYour pet's status: \n" +
                makeBold("\n\tName: ") + name + 
                makeBold("\n\tSpecies: ") + species + 
                makeBold("\n\tHunger: ") + hunger + 
                makeBold("\n\tHappiness: ") + happiness + 
                makeBold("\n\tIs your pet asleep? : ") + strIsSleeping;
    }

    // method that lowers happiness for a vet visit
    public void vetVisit (int multStep) {
        happiness -= multStep * 3;
        clampStats();
        System.out.println(makeBold(name) + " has visited the vet!");
    }

    // prints ascii photo of pet
    public void takePhoto() {
        System.out.println("\nThis is a picture of your pet, " + makeBold(name) + ": \n\n");
        System.out.println("      /\\_ /\\");
        System.out.println("     ( o.o )");
        System.out.println("      > ^ < ");
        System.out.println("     /     \\");
        System.out.println("    /   O   \\");
        System.out.println("   /         \\");
        System.out.println("   \\_________/");
        System.out.println("\n\n\n");
    }

    // this method takes in text and returns it wrapped in bold escape codes
    public String makeBold(String text) {
        // ansi codes for bold and reset
        String boldCode = "\033[1m";
        String resetCode = "\033[0m";
        
        return boldCode + text + resetCode;
    }
}