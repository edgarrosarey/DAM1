/*
10/10/19
 */
//Author: Edgar
package m3uf1p04;
//Libraries:
import java.util.Scanner;
public class M3uf1p04 {
// Global Declarations:
static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
      P9();
    }
   public static void P9(){
      int num1,num2;
 
		System.out.println("Number1 ?");
		num1= keyboard.nextInt();
                num2=num1%7;
 
		if(num2==0)
			{
			System.out.println("it is divisible of 7");
			}	
                else	
                {
                    System.out.println("it is not divisible of 7");
                    
                }
   
   }
}
					