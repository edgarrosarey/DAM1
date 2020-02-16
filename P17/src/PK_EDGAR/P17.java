/*
17/01/20
 */
//Author: Edgar
package PK_EDGAR;
//Libraries:

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

public class P17 {
    //Global declarations:

    static Scanner keyboard = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        //Option 1
        System.out.println("Option 1");
        int eu;
        float res;
        //case 1:
        //preguntar euro;
        System.out.println("euros: ");
        eu = keyboard.nextInt();
        res = conversorEdgar(eu);
        System.out.println(res);
        //break;
        //Option 2
        System.out.println("Option 2");
        int eur;
        double rest;
        //case 2:
        //preguntar euro;
        System.out.println("euros: ");
        eur = keyboard.nextInt();
        rest = conversorEdgar2(eur);
        System.out.println(rest);
        //break;

        //Option 3
        System.out.println("Option 3");
        int eur3;
        String rest3;
        //case 3:
        //preguntar euro;
        System.out.println("euros: ");
        eur3 = keyboard.nextInt();
        rest3 = conversorEdgar3(eur3);
        System.out.println(rest3);
        //break;

        //Option 4
        System.out.println("Option 4");
        String eur4;
        int rest4;
        //case 4:
        //preguntar euro;
        System.out.println("euros: ");
        eur4 = keyboard.next();
        rest4 = conversorEdgar4(eur4);
        System.out.println(rest4);
        //break;

        //Option 5
        System.out.println("Option 5");
        float eur5;
        int rest5;
        //case 5:
        //preguntar euro;
        System.out.println("euros: ");
        eur5 = keyboard.nextFloat();
        rest5 = conversorEdgar5(eur5);
        System.out.println(rest5);
        //break;

        //Option 6
        System.out.println("Option 6");
        float eur6;
        String rest6;
        //case 5:
        //preguntar euro;
        System.out.println("euros: ");
        eur6 = keyboard.nextFloat();
        rest6 = conversorEdgar5(eur6);
        System.out.println(rest6);
        //break;

        int option = -1;
        keyboard.useDelimiter("\n");
        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//init of switch 
                case 1:
                    conversorEdgar(eu);
                    break;
                case 2:
                    conversorEdgar2(eur);
                    break;
                case 3:
                    conversorEdgar3(eur3);
                    break;
                case 4:
                    conversorEdgar4(eur4);
                    break;
                case 5:
                    conversorEdgar5(eur5);
                    break;
                case 6:
                    conversorEdgar6(eur6);
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
                case 11:
                    p11();
                default:
                    System.out.println("Invalid Option...");
            }

        }
    }

    private static void userMenu() {

    }

    private static float conversorEdgar(int euro) {
        float result = 0;
        result = (float) euro / 0.91f; //cast

        return result;
    }

    private static double conversorEdgar2(int euroo) {
        double result = 0;
        result = (double) euroo / 0.91; //cast

        return result;

    }

    private static String conversorEdgar3(int euro3) {
        String result;
        result = String.valueOf(euro3 / 0.91); //cast

        return result;
    }

    private static int conversorEdgar4(String euro4) {
        int result;
        result = (int) (euro4 / 0.91); //cast

        return result;
    }

    private static int conversorEdgar5(float euro5) {
        int result;
        result = (int) (euro5 / 0.91); //cast

        return result;
    }

    private static String conversorEdgar6(float euro6) {
        String result;
        result = String.valueOf(euro6 / 0.91); //cast

        return result;
    }

    private static void p7() {

    }

    private static void p8() {

    }

    private static void p9() {

    }

    private static void p10() {

    }

    private static void p11() {
        double preu = 100;
        double tax = 21;
        double res = function(preu, tax); //llamar a function
        System.out.println(res); //llamar a procedimiento
        method(preu, tax, res);

    }

    //function CalculoPVP
    private static double function(double price, double iva) {
        double PVP = 0; //declarar la variable de return
        PVP = price + price * (iva / 100);
        return PVP;
    }
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String RED = "\u001B[31m";

    public static void method(double price, double iva, double res) {

        System.out.println(RED + "Price=" + price);
        System.out.println(CYAN + "IVA=" + iva);
        System.out.println(PURPLE + "Result=" + res);

    }
}
