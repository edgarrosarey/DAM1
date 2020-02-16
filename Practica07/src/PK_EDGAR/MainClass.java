//Author:Edgar
//Random
package PK_EDGAR;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MainClass {
//Global Declarations:

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {//start of main
        int option;
        do {//start of do-while
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
                case 6:
                    p6();
                    break;
                case 7:
                    p7();
                    break;
                case 8:
                    p8();
                    break;
                case 9:
                    p9();
                    break;
                case 10:
                    p10();
                case 0:
                    p0();
                    break;
                default:
                    System.out.println("Invalid Option ....");
            }//end of switch
        } while (option != 0); //end of do-while
    }//end of main

    private static void userMenu() {
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("Option1:(Numeros de 0 a 9):");
        System.out.println("Option2:");
        System.out.println("Option3:");
        System.out.println("Option4:");
        System.out.println("Option5:");
        System.out.println("Option6:");
        System.out.println("Option7:");
        System.out.println("Option8:");
        System.out.println("Option9:");
        System.out.println("Option10:");
        System.out.println("Option0: (exit):");
        System.out.println("\n------Option ?-------");

    }

    private static void p1() {
        System.out.println("*****Option 1*****");
    }

    private static void p2() {
        System.out.println("*****Option 2*****");

    }

    private static void p3() {
        System.out.println("*****Option 3*****");

    }

    private static void p4() {
        System.out.println("*****Option 4*****");
    }

    private static void p5() {
        System.out.println("*****Option 5*****");

    }

    private static void p6() {
        System.out.println("*****Option 6*****");

    }

    private static void p7() {
        System.out.println("*****Option 7*****");

    }

    private static void p8() {
        System.out.println("*****Option 8*****");

    }

    private static void p9() {
        System.out.println("*****Option 9*****");
    }

    private static void p10() {
        System.out.println("*****Option 10*****");
        int num, n;
        System.out.println("Even number less than: ");
        num = keyboard.nextInt();
        do {
            n = (int) (Math.random() * num);
        } while (n % 2 != 0);
        System.out.println("And the chosen even number is: " + n);

    }

    private static void p0() {
    }

}
