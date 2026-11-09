public class Runner {

    public static void main(String[] args) {

        Candy[] candyBag = new Candy[5];
        
        String[] type = new String[5];
        double[] size = new double[5];


        type = new String[]{
            "Twix", 
            "Welchs",
            "Starburst", 
            "Hichew", 
            "Haribos"
        };

        size = new double[]{
            4.9, 
            3.5, 
            2.3, 
            3.2, 
            7.6
        };

        for (int i = 0; i < candyBag.length; i++) {
            candyBag[i] = new Candy(type[i], size[i]);
        }

        for (int i = 0; i < candyBag.length; i++) {
            System.out.print("Candy Type: " + candyBag[i].getType());
            System.out.println("\tSize: " + candyBag[i].getSize() + " ounces");
        }
    }
}