import java.util.Scanner;

public class BinConverter {
// BELOW CODE USING LOOPS
    public static void main(String[] args)
    {
        Scanner binary = new Scanner(System.in);
        System.out.println("Enter a number to convert to binary:");
        double number = binary.nextInt();
        double remainder = 0;
        double result = 0;

        System.out.print("Binary: ");

        int power = 0;

        while (Math.pow(2, power + 1) <= number) 
        {
            power++;
        }

        if (number == 0) 
        {
            System.out.print("0");
        }

        while (power >= 0)
        {
            int divisor = (int) Math.pow(2, power);

            if (number >= divisor) {
                System.out.print("1");
                number = number - divisor;
            } else {
                System.out.print("0");
            }

            power = power - 1;
        }
        System.out.println();
/*
//BELOW IS THE CODE THAT WORKS WITH MULTIPLE IF STATEMENTS

        //Division by 32
        result = number/32; //divide number by 8 and set equal to the result
        if( result > 0 )
        {
            System.out.print("1"); //print 1 on the same line.
            remainder = number - 32; //get the remainder by setting the remainder to number-8
            number = remainder; //number will become the remainder
        } 
        else 
        {
            System.out.print("0");
        }

        //Division by 16
        result = number/16; //divide number by 8 and set equal to the result
        if( result > 0 )
        {
            System.out.print("1"); //print 1 on the same line.
            remainder = number - 16; //get the remainder by setting the remainder to number-8
            number = remainder; //number will become the remainder
        } 
        else 
        {
            System.out.print("0");
        }
        
        //Division by 8
        result = number/8; //divide number by 8 and set equal to the result
        if( result > 0 )
        {
            System.out.print("1"); //print 1 on the same line.
            remainder = number - 8; //get the remainder by setting the remainder to number-8
            number = remainder; //number will become the remainder
        } 
        else 
        {
            System.out.print("0");
        }

        //Division 4
        result = number/4; //divide number by 8 and set equal to the result
        if( result > 0 ){
            System.out.print("1");
            remainder = number - 4;
            number = remainder;
        } 
        else {
            System.out.print("0");//print 0
        }

        //Division 2
        result = number/2; //divide number by 8 and set equal to the result
        if( result > 0 ){
            System.out.print("1");
            remainder = number - 2;
            number = remainder;
        } 
        else {
            System.out.print("0");//print 0
        }

        //Division 1
        result = number/1; //divide number by 8 and set equal to the result
        if( result > 0 ){
            System.out.print("1");
            remainder = number - 1;
            number = remainder;
        } 
        else {
            System.out.print("0");//print 0
        }

        //Can you optimize this so the remainder variable doesn't get used?
        //Can you implement a loop?
*/
        System.out.println("");
    }
}

