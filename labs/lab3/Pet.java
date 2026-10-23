public class Pet {

    private String name, species, isSleeping;
    private int hunger, happiness;
    private boolean isAsleep;

    Pet(String name, String species, int hunger, int happiness, boolean isAsleep) {
        this.name = name;
        this.species = species;
        this.hunger = hunger;
        this.happiness = happiness;
        this.isAsleep = isAsleep;
    }

    public void goOnWalk(int miles) {
        if (!isAsleep && hunger <= 70 && happiness < 90) {
            System.out.println("Your pet is going on a walk!");
            
            happiness += miles * 3;
            hunger += miles * 5;
        
            System.out.println(name + " went on a " + miles + " mile walk and loved the outdoors!");

        } else {
            
            if (isAsleep) {
                System.out.println(name + " did not go on a walk because they were sleeping.");
            } else if(hunger > 70) {
                System.out.println(name + " did not go on a walk because they were too hungry.");
            } else {
                System.out.println(name + " did not go on a walk because they were too happy.");
            }
        }

    }

    public void feed(int decStep) {
        if (!isAsleep) {
            hunger += decStep * 3;
            System.out.println("Your pet ate some food!");
        } else {
            System.out.println(name + " will not eat as they are sleeping. Don't disturb them!");
        }
    }

    public boolean play(int ascStep) {
        if (isAsleep || hunger > 80) {
            return false;
        } else {
            happiness += ascStep;
            hunger += 0.5 * ascStep;
            return true;
        }
    }

    public void toggleSleep() {
        isAsleep = !isAsleep;

        if (isAsleep) { 
            isSleeping = "";
        } else {
            isSleeping = " NOT ";
        }

        System.out.println("Now, your pet is " + isSleeping + "sleeping.");
    }

    public boolean needsCare() {
        if (hunger > 70 || happiness < 50) {
            return true;
        } else {
            return false;
        }
    }

    public String getStatus() {
        
        if (isAsleep) { 
            isSleeping = " yes";
        } else {
            isSleeping = " no";
        }
        
        return "Your pet's status: \n" +
                "\n\tName: " + name + 
                "\n\tSpecies: " + species + 
                "\n\tHunger: " + hunger + 
                "\n\tHappiness: " + happiness + 
                "\n\tIs your pet asleep? : " + isSleeping;
    }

    public void vetVisit (int multStep) {
        happiness -= multStep * 3;
        System.out.println("Your pet has visited the vet!");
    }

    public void takePhoto() {
        System.out.println("\nThis is a picture of your pet, " + name + ": \n\n");
        System.out.println("      /\\_ /\\");
        System.out.println("     ( o.o )");
        System.out.println("      > ^ < ");
        System.out.println("     /     \\");
        System.out.println("    /   O   \\");
        System.out.println("   /         \\");
        System.out.println("   \\_________/");
        System.out.println("\n\n\n");
    }
}