package edu.guilford;
import java.util.Random;
import java.util.Scanner;
//Dylan Davis
//9-23-2024
public class Main {
    public static void main(String[] args) {

        Random rand = new Random(); //new random class
        Scanner scan = new Scanner(System.in); //new scanner class

        System.out.print("This is a program for rolling dice. \nHow many sides should each die have? ");
        int sides = scan.nextInt(); //initialize scanner as next integer
        int sum = 0; //initialize sum integer
        System.out.print("How many dice would you like to roll? ");
        int number = scan.nextInt(); //initialize number as next input integer
        

        // default for loop, prints loop variable as it counts up
        for (int i = 0; i < number; i++) { //run for as long as integer "i" is less than integer "number"
            int diceRoll = rand.nextInt(1,sides+1); //random number between 1 and integer "sides"
            sum += diceRoll;
            //System.out.println( "sum of " + i + "d" + sides + " = " + sum);
        }
        System.out.println("Rolling" + number + "d" + sides + "=" + sum);
        scan.close(); //prevent scanner resource leak
    }
}