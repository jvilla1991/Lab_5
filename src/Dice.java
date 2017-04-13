import java.util.Scanner;
import java.util.Random;

public class Dice {

    Random randGen = new Random();
    int sides;

    public void getSides(int x)
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

        dice1.getSides(userSides);
        dice2.getSides(userSides);
        scnr.nextLine();

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