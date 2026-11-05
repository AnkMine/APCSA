import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;


public class SlotMachine {


    // Instance Variables
    private Font fontPayout, fontSlot, fontText;
    private Font fontBalance, fontPromptLarge, fontPromptSmall;
    private Color blue, yellow, white, lightGray;
    private int num1, num2, num3;
    private int winnings;
    private String warningMessage;


    public int balance;
    public int bet;


    // Constructor
    public SlotMachine(int balance) {
    //Example: Initialize/instantiate instance variables
    fontPayout = new Font("Arial", Font.BOLD, 20); //14 is font size. 
    fontSlot = new Font(Font.MONOSPACED, Font.BOLD, 72);
    fontText = new Font("Arial", Font.BOLD, 18);

    fontBalance = new Font("Arial", Font.BOLD, 26);
    fontPromptLarge = new Font("Arial", Font.BOLD, 18);
    fontPromptSmall = new Font("Arial", Font.PLAIN, 13);

    blue = new Color(0, 0, 255);
    yellow = new Color(255, 255, 0);
    white = new Color(255, 255, 255);
    lightGray = new Color(230, 230, 230);

    this.balance = balance;
    this.bet = 1; // default starting bet
    this.winnings = 0;
    this.warningMessage = "";

    }


    // Example: Draw a payout table. 
    private void drawPayout(Graphics g){
        g.setColor(yellow);
        g.fillRect(30, 18, 335, 100);
        g.setFont(fontPayout);
        g.setColor(blue);
        g.drawString("7 7 7 = 100 points", 40, 40); 
        g.drawString("3 of a kind = 5 points", 40, 60); 
        g.drawString("2 of a kind = 2 points", 40, 80); 


    } 



    /* Draw the machine (this can be just a box or you can import an image) with the 3 numbers, current balance, 
        and calls drawPayOut() */
    public void drawMachine(Graphics g) {
       // draw the payout table
       drawPayout(g);
       g.setColor(Color.WHITE);
       int x = 140;    
       int s = 100;
       int totalWidth = 500;

       // balance box
       g.setColor(white);
       g.fillRect(x, 180, totalWidth, 45);
       g.setColor(Color.BLACK);
       g.setFont(fontBalance);
       g.drawString("Balance: " + balance, x + 175, 212);

       // slot number boxes
       int y = 240;
       g.setColor(white);
       g.fillRect(x, y, s, s);
       g.fillRect(x+200, y, s, s);
       g.fillRect(x+400, y, s, s);

       g.setFont(fontSlot);
       g.setColor(Color.BLACK);
       g.drawString(num1 + "", x + 25, y + 75);
       g.drawString(num2 + "", x + 225, y + 75);
       g.drawString(num3 + "", x + 425, y + 75);


       // instruction box
       g.setColor(lightGray);
       g.fillRect(x, 355, totalWidth, 160);
       g.setColor(Color.DARK_GRAY);
       g.setFont(fontPromptLarge);
       g.drawString("Press the SPACEBAR to spin!", x + 120, 380);
       g.setFont(fontPromptSmall);
       g.drawString("Use the '+' key to increase bet by 1 | Use the '-' key to decrease bet by 1", x + 30, 402);
       g.drawString("Use the '5' key to increase bet by 5 | Use the '4' key to decrease bet by 5", x + 30, 425);
       g.drawString("Use the 'M' key to set bet to max bet | Use the 'N' key to set bet to min bet", x + 30, 450);
       g.drawString("Press 'Q' to quit the game. ", x + 50, 485);

       // stats and warnings
       g.setFont(fontText);
       g.setColor(white);
       g.drawString("Current Bet: " + bet, x, 525);
       g.drawString("Last Winnings: " + winnings, x + 250, 525);
       
       
       // display game over or warning text
       // display bet/balance status/warnings as needed
       if (!keepPlaying()) { 
            g.setColor(Color.RED);
            g.drawString("Game Over! You are out of points. ", 140, 550);
            
       }
        
    }

    // method that increases the bet by the amount given
    public void increaseBet(int amount) {
        // caps bet at balance so user cant bet more than they have
        if (bet + amount <= balance) {
            bet += amount;
        } else {
            bet = balance;
        }
    }

    // method that decreases the bet by the amount given
    public void decreaseBet(int amount) {
        // floors bet at 1 so user cant bet 0 or less
        if (bet - amount >= 1) {
            bet -= amount;
        } else {
            bet = 1;
        }
    }

    // sets bet to the max which is the whole balance
    public void setMaxBet() {
        bet = balance;
    }

    // sets bet to the min which is 1
    public void setMinBet() {
        bet = 1;
    }

   


    /* Generate 3 new random numbers for num1, num2 and num3.  Calculate the winnings.  Updates the balance and 
        winnings. */
    public void play(){

        // ensure user has enough balance and a valid bet
        if (balance >= bet && bet > 0) {
            balance -= bet;

            num1 = (int)(Math.random()*9)+1;
            num2 = (int)(Math.random()*9)+1;
            num3 = (int)(Math.random()*9)+1;

        }
        

        // calculate winnings based on rules
        if (num1 == 7 && num2 == 7 && num3 == 7) {
            winnings = 100 * bet;
        } else if (num1 == num2 && num2 == num3) {
            winnings = 5 * bet;
        } else if (num1 == num2 || num2 == num3 || num1 == num3) {
            winnings = 2 * bet;
        } else {
            winnings = 0;
        }

        balance += winnings;
    }  

    // Return true if balance > 0. Return false otherwise.
    public boolean keepPlaying() {
        return balance > 0;
    } 


}