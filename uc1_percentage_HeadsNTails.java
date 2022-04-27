package com.example.basic_core_java;
import java.util.Scanner;
public class uc1_percentage_HeadsNTails
{
    public class PowersOf2{
        public static boolean isInputValid(int num)
        { return num>=0 && num<=31;}
    }

    {
        public static double flipCoin () {
        return Math.random();
    }
        public static void main (String[]args)
        public static void powerOf2 ( int num)
        {
            for (int i = 0; i <= num; i++) {
                System.out.println("2 power " + i + " is: " + Math.pow(2, i));
            }
        }
        {
            //integer is getting generated
            int totalDieRoll = 0;
            int headCount = 0;
            int tailCount = 0;
            //scanner function is getting initalized
            Scanner input = new Scanner(System.in);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of times to flip the coin : ");
            int userInput = input.nextInt();
            //for-loop is getting initilized
            {
                for (int i = 0; i <= num; i++) {
                    System.out.println("2 power " + i + " is: " + Math.pow(2, i));
                }
            }
            for (int i = 0; i < userInput; i++) {
                double flipCoin = flipCoin();
                totalDieRoll++;

                //if statement is  getting utilized
                if (flipCoin < 0.5) {
                    headCount++;
                    System.out.println("Heads");
                } else if (flipCoin > 0.5) {
                    tailCount++;
                    System.out.println("Tails");
                }
            }
        }
        //while loop is getting instialized
        while (true) {
            System.out.print("Enter the value of N: ");
            int n = sc.nextInt();
            if (!isInputValid(n)) System.out.println("Entered number is invalid");
            else {
                powerOf2(n);
                break;
                double headPercentage = ((double) headCount / (double) totalDieRoll) * 100;
                System.out.println("Head Percentage : " + headPercentage);
                double tailPercentage = ((double) tailCount / (double) totalDieRoll) * 100;
                System.out.println("Tail Percentage : " + tailPercentage);
            }
        }


    }