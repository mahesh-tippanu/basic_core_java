package com.example.basic_core_java;
import java.util.Scanner;
public class percentage_HeadsNTails {
    public static double flipCoin() {
        return Math.random();
    }
    public static void main(String[] args)
    {
        //integer is getting generated
        int totalDieRoll = 0;
        int headCount = 0;
        int tailCount = 0;
        //scanner function is getting initalized
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of times to flip the coin : ");
        int userInput = input.nextInt();
        //for-loop is getting initilized
        for (int i = 0; i < userInput ; i++ ) {
            double flipCoin = flipCoin();
            totalDieRoll++;
        //if statement is  getting utilized
            if (flipCoin<0.5)
            {
                headCount++;
                System.out.println("Heads");
            }
            else if (flipCoin>0.5) {
                tailCount++;
                System.out.println("Tails");
            }
        }
        double headPercentage = ((double)headCount/(double)totalDieRoll)*100;
        System.out.println("Head Percentage : " + headPercentage);
        double tailPercentage = ((double)tailCount/(double)totalDieRoll)*100;
        System.out.println("Tail Percentage : " + tailPercentage);
    }
}
