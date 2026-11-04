import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;  


public class SlotMachine {


    // Instance Variables
    private Font fontPayout;
    private Color blue, yellow;
    private int num1, num2, num3;
    private int winnings;
    private int balance;


    // Constructor
    public SlotMachine(int balance) {
    //Example: Initialize/instantiate instance variables
    fontPayout = new Font("Arial", Font.BOLD, 20); //20 is font size. 
    blue = new Color(0, 0, 255);
    yellow = new Color(255, 255, 0);

    this.balance = balance;

    }


    // Example: Draw a payout table. 
    private void drawPayout(Graphics g){
        g.setColor(yellow);
        g.fillRect(30, 18, 225, 68);
        g.setFont(fontPayout);
        g.setColor(blue);
        g.drawString("7 7 7 = 100 points", 40, 40); 
        g.drawString("3 of a kind = 5 points", 40, 60); 
        g.drawString("2 of a kind = 2 points", 40, 80); 


    } 



    /* Draw the machine (this can be just a box or you can import an image) with the 3 numbers, current balance, 
        and calls drawPayOut() */
    public void drawMachine(Graphics g) {
        // Draw the machine
        g.setColor(Color.WHITE);

        int s = 100;
        int x = 140;
        int y = 250;
        g.fillRect(x, y, s, s);
        g.fillRect(x+200, y, s, s);
        g.fillRect(x+400, y, s, s);



        drawPayout(g);
    } 


    /* Generate 3 new random numbers for num1, num2 and num3.  Calculate the winnings.  Updates the balance and 
        winnings. */
    public void play(){
        num1 = (int)(Math.random()*9)+1;
        num2 = (int)(Math.random()*9)+1;
        num3 = (int)(Math.random()*9)+1;

        if (num1 == 7 && num2 == 7 && num3 == 7) {
            winnings = 100;
        } else if(num1 == num2 && num2 == num3) {
            winnings = 5;
        } else if (num1 == num2 || num2 == num3 || num1 == num3) {
            winnings = 2;
        } else {
            winnings = 0;
        }

        balance = balance - 1 + winnings;
    }  




    // Return true if balance > 0. Return false otherwise.
    public boolean keepPlaying() {
        return balance > 0;
    } 


}
