import java.util.Scanner;
import java.util.Random;

// Create an Application that simulates dice rolling

// Dice object created. There are going to be multiple dice(two in this case) with the same characteristics(number of sides) and actions(rolling)
public class Dice {

    // Define a new generator after importing Java's Random Class
    Random randGen = new Random();
    int sides;



    public void setSides(int x)
    {
        sides = x;
        return;
    }

    public int rollDice()
    {
        return randGen.nextInt(sides) + 1;
    }



    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userSides = 0;
        String rollAgain;
        boolean a = true;
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        System.out.println("How many sides are on your dice?");
        userSides = scnr.nextInt();

        dice1.setSides(userSides);
        dice2.setSides(userSides);

        scnr.nextLine();

        System.out.println("If you are ready to roll, enter any key");
        scnr.nextLine();

        // Validation loop. This one is rolling the dice everytime the user presses enter.
        do {
            System.out.println("Results of Die 1: " + dice1.rollDice());
            System.out.println("Results of Die 2: " + dice2.rollDice());
            System.out.println();
            System.out.println("If you wish to roll again, press ENTER. Press any key and then enter to exit... ");
            rollAgain = scnr.nextLine();
            if (!rollAgain.equalsIgnoreCase(""))
            {
                a = false;
            }
        } while (a == true);
    }
}