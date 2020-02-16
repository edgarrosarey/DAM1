/*
10/01/20
 */
//Author: Edgar
package PK_EDGAR;
//Libraries:

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

public class P15 {

    //Global declarations:
    static Scanner keyboard = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");
    static int[] sec;

    public static void main(String[] args) {
        int option = -1;
        keyboard.useDelimiter("\n");
        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//init of switch 
                case 1:
                    p1();
                    break;
                case 2:
                    p2();
                    break;
                case 3:
                    p3();
                    break;
                case 4:
                    p4();
                    break;
                case 5:
                    p5();
                    break;
                case 0:
                    p0();
                    break;
                default:
                    System.out.println("Invalid Option ....");
            }//end of switch
        }
        while (option != 0); //end of do-while

    }

    private static void userMenu() {
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("Option1:(Numeros de 0 a 5):");
        System.out.println("Option2:");
        System.out.println("Option3:");
        System.out.println("Option4:");
        System.out.println("Option5:");
        System.out.println("Option0: (exit):");

        System.out.println("\n\nOption ?");

    }

    private static void p1() {
        int num;
        System.out.println("Give me a number");
        num = keyboard.nextInt();
        if (num % 2 == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }
        if (num % 7 == 0) {
            System.out.println("This number is divisible by 7");
        }
        if (num >= 5 && num <= 10) {
            System.out.println("This number is between 5 and 10");
        }
        if (num < 18 || num > 70) {
            System.out.println("This number is less than 18 or greater than 70");
        }

    }

    private static void p2() {
        int index;
        String name, a, b;
        for (index = 0; index < 5; index++) {
            System.out.println("What is your name?");
            name = keyboard.next();
            System.out.println("Are you a student of Monlau?");
            a = keyboard.next();
            if (a.equals("yes") || a.equals("Yes") || a.equals("YES")) {
                System.out.println("Are you a student of DAM OR ASIX?");
                b = keyboard.next();
                if (b.equals(("DAM"))) {
                    System.out.println("You will learn programming in 2 years");
                }
                if (b.equals("ASIX")) {
                    System.out.println("You will learn computer systems in 2 years");
                }
            } else {
                System.out.println("You were wrong, this space is reserved for Monlau students");
            }
        }

    }

    private static void p3() {
        int index, candy;
        double money, Return, candymoney;
        String name;
        for (index = 0; index < 7; index++) {
            System.out.println("What is your name?");
            name = keyboard.next();
            System.out.println("How much money do you have?");
            money = keyboard.nextDouble();
            candy = (int) (money / 0.5);
            candymoney = candy * 0.5;
            Return = money - candymoney;
            System.out.println("You can buy " + candy + " candies " + "and the change is " + df.format(Return));

        }

    }

    private static void p4() {

    }

    private static void p5() {
        int index, positionMax = 0, runners = 10, positionMin = 0;
        float maxValue = 0, minValue = 10;
        sec = new int[runners];
        double average = 0, sumMarks = 0;
        for (index = 1; index < 9; index++) {
            System.out.print("Runner " + index + "?");
            sec[index] = keyboard.nextInt();
            sumMarks += sec[index];
            average = sumMarks / 8;

            if (sec[index] > maxValue) {
                maxValue = (int) sec[index];
                positionMax = index;
            }

            if (sec[index] < minValue) {
                maxValue = (int) sec[index];
                positionMin = index;
            }
            sumMarks += sec[index];
            average = sumMarks / 8;
        }
        System.out.println("Average:" + average);
        for (index = 1; index < 9; index++) {
            if (sec[index] > average) {
                System.out.println("These runners above average:" + sec[index]);
            }
        }
        System.out.println("Best runner is " + sec[index] + " with " + sec[positionMin]);
        System.out.println("Worst runner is " + sec[index] + " with " + sec[positionMax]);

    }

    private static void p0() {
    }
}
