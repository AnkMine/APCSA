
public class Oven
{
    //prints the temperature, and whether oven is ready
    public void checkTemp()
    {
        double temp = (Math.random() *250) + 250;
        temp = Math.round(temp*100)/100.0;
        
        //checks tempurature of oven
        if (temp<=425)
        {
        System.out.println("It's " + temp + " degrees, the oven is ready!");
        }
        else
        {
            System.out.println("It's " + temp + " degrees, too hot!");
        }

    }

    //prints time left
    public void checkTimer()
    {
        int min = (int)(Math.random() * 11);
         if (min<2)
         {
            System.out.println("Beep Beep");
         }

        else
        {
            System.out.println(min + " minutes left");
        }
    }

    //prints time spent
    public void bakePizza()
    {
        int minutes = (int)(Math.random()*16)+5;
        if (minutes>15)
        {
            System.out.println("Danger of burning");
        }
        else
        {
            System.out.println("The pizza's baking nicely.");
            System.out.println("It's been " + minutes + " minutes.");
        }

    }
}