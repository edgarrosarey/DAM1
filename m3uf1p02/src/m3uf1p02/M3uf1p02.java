/*
2/10/19
 */
//Author: Edgar
package m3uf1p02;
//Libraries:
import java.util.Scanner;
import java.util.InputMismatchException;
public class M3uf1p02 {
static Scanner keyboard= new Scanner(System.in);
    public static void main(String[] args) {
    keyboard.useDelimiter("\n");   
 P2_10();                                                                  
}   
     public static void P2_10(){
       int option; //We will save the user's option
       boolean leave = false;
        while (leave); 
        {
 
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Exit");
        }
            try {
 
                System.out.println("Write one of the options");
                option = keyboard.nextInt();
            
                switch (option) {
                    case 1:
                        System.out.println("You have selected the option 1");
                        break;
                    case 2:
                        System.out.println("You have selected the option 2");
                        break;
                    case 3:
                        System.out.println("You have selected the option 3");
                        break;
                    case 4:
                        leave= true;
                        break;
                    default:
                        System.out.println("Only numbers between 1 and 4");
                }
                }
             catch (InputMismatchException e) {
                System.out.println("You must insert a number");
                keyboard.next(); 
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Exit");
             System.out.println("Write one of the options");
                option = keyboard.nextInt();
            switch (option) {
                    case 1:
                        System.out.println("You have selected the option 1");
                        break;
                    case 2:
                        System.out.println("You have selected the option 2");
                        break;
                    case 3:
                        System.out.println("You have selected the option 3");
                        break;
                    case 4:
                        leave= true;
                        break;
            }
            
            }
            
        }
}