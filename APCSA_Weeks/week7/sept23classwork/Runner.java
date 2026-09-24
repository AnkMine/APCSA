public class Runner {

    public static void main(String [] args) {

        // instantiating UseRadius(); object using default constructor
        UseRadius r1 = new UseRadius();

        // instantiating UseRadius(double); object using initialization constructor
        UseRadius r2 = new UseRadius(10.0);

        // uses objects and calls UseRadius.printVol();
        r1.printVol();
        r2.printVol();

        // uses object "r1" and calls UseRadius.printArea(); and .printArea(double);
        r1.printArea();
        r1.printArea(5);

        // uses object "r2" and calls UseRadius.printArea(); and .printArea(double);
        r2.printArea();
        r2.printArea(5);

        // uses object "r2" and calls UseRadius.printVol(double, double);
        r2.printVol(7, 10);

    }
}