import java.util.Scanner;

public class MathGame {

    public static void main(String[] args)
    {
        //Creating an array to display the choices
        String[] choices = {"f(x) = ax^2+bx+c", "f(x) = a + b" , "f(x) = a - b", "f(x) = a / b"};

        
        //Displays the array to the user
        for (int i = 0; i < choices.length; i++)
        {
            System.out.println("\n " + (i + 1) + "." + choices[i]);
        }

        //Allows the user to type in a number to calculate the math formula
        Scanner userChoice = new Scanner(System.in);
        System.out.print("Type in a number corresponding to the type of equation you would like to calculate:\n");
        userChoice = scan.nextLine();
    }


}