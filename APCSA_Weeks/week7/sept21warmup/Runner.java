public class Runner {

    public static void main(String [] args) {

        // instantiate new Profile object using default constructor
        Profile p1 = new Profile();

        // instantiate new Profile object using initizlization constructor
        Profile p2 = new Profile("Jennifer", 16);

        // calls printInfo method using 2 Profile objects and passes 2 id parameters
        p1.printInfo(1234);
        p2.printInfo(4321);
    }
}