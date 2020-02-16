//Author:edgarrosrey
//FOR - SWITCH

import java.util.Scanner;

public class NewMain {

    //Global declarations:
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
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
                case 0:
                    p0();
                    break;
                default:
                    System.out.println("Option No ....");
            }//end of switch
            //System.out.println("press any key to continue");
            //String key=keyboard.next();
        }
    }

    private static void userMenu() {
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("Que te apetece hacer ?");
        System.out.println("1. Un borika ");
        System.out.println("2. Netflix con mantitas");
        System.out.println("3. Luces apagadas");
        System.out.println("4. Nada (exit):");

        System.out.println("\n\nElige una opción ?");

    }

    private static void p1() throws InterruptedException {
        System.out.println("*****Option BORIKA*****");
    }

    private static void p2() throws InterruptedException {
        System.out.println("*****Option  NETFLIX*****");
        System.out.println("Porfavor introduzca este siguiente numero:639049350 para localizar la ubicación de mi vivienda");
    }

    private static void p3() throws InterruptedException {
        System.out.println("*****Option *****");
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

    private static void p8() throws InterruptedException {
        System.out.println("*****Option 8*****");
    }

    private static void p9() throws InterruptedException {
        System.out.println("*****Option 9*****");
        int count, f, s = 0, a, c, b, d;
        System.out.println("tell me a number");
        f = keyboard.nextInt();

        System.out.print("N1=" + f + "\n");
        a = f * 9;
        for (c = 0; c <= 9; c++) {
            b = f * c;
            System.out.print(b + " ");
            Thread.sleep(500);
        }
        System.out.println(" ");
        for (count = 9; count >= 0; count--) {
            d = f * count;
            System.out.print(d + " ");
            Thread.sleep(500);
        }

    }

    private static void p0() {
        System.out.println("*****Option 0*****");
    }

}
