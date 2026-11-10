public class Runner {

    // main method
    public static void main(String[] args) {

        // creates array of Candy objects with 5 slots
        Candy[] candyBag = new Candy[5];
        // fills the array with new Candy objects
        candyBag[0] = new Candy("Twix", 4.9);
        candyBag[1] = new Candy("Welchs", 3.5);
        candyBag[2] = new Candy("Starburst", 2.3);
        candyBag[3] = new Candy("Hichew", 3.2);
        candyBag[4] = new Candy("Haribos", 7.6);
        
        // parallel arrays that hold the same data as the Candy objects
        String[] type;
        double[] size;


        // creates type array with the candy names
        type = new String[]{
            "Twix", 
            "Welchs",
            "Starburst", 
            "Hichew", 
            "Haribos"
        };

        // makes a parallel array with the sizes
        size = new double[]{
            4.9, 
            3.5, 
            2.3, 
            3.2, 
            7.6
        };

        // scrolls through the parallel arrays and rebuilds each Candy object from type and size
        for (int i = 0; i < candyBag.length; i++) {
            candyBag[i] = new Candy(type[i], size[i]);
        }

        // prints each candy's type and size
        for (int i = 0; i < candyBag.length; i++) {
            System.out.print("Candy Type: " + candyBag[i].getType());
            System.out.println("\tSize: " + candyBag[i].getSize() + " ounces");
        }
    }
}