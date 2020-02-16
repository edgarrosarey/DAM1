/*
27/09/19
 */
//Author: Edgar
package m3.uf1p02;
//Librerias:
import java.util.Scanner;
public class M3UF1P02 {
    static Scanner keyboard= new Scanner(System.in);
    public static void main(String[] args) {
        keyboard.useDelimiter("\n");
     P2_1();
                                                                    
    }
    
    public static void P2_1(){
       System.out.print("Celsius ?:");
        float celsius= keyboard.nextFloat();
        float kelvin=celsius + 273.15f;
        System.out.println(celsius+  " = "+kelvin);
        float fahrenheit= 9/5*celsius + 32;
        System.out.println(celsius+  " = "+fahrenheit);
        
        System.out.print("Kelvin ?:");
        float kelvin= keyboard.nextFloat();
        float kelvin=celsius + 273.15f;
        System.out.println(celsius+  " = "+kelvin);
        float fahrenheit= 9/5*celsius + 32;
        System.out.println(celsius+  " = "+fahrenheit);
}
        
        
}

    public static void P2_2(){    
    System.out.println("Name ?:");
    System.out.println("Surnames ?:");
}
}