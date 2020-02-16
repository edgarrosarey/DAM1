/*
13/10/19
 */
//Author: Edgar
package PK_EDGAR;
//Libraries:
import java.util.Scanner;
public class NewMain {
  //Global Declarations:
static Scanner keyboard= new Scanner(System.in);
    public static void main(String[] args) {
 keyboard.useDelimiter("\n");
P7();	 
    }
  public static void P7(){
  boolean woman;
  int age;
      System.out.println("Are you woman?");
      woman=keyboard.nextBoolean();
      //if the user is not a woman:
      if(woman==false)
      {
          System.out.println("“Welcome to the Online Store”");
      }
      //if the user is a woman:
     if(woman==true)
     {
         System.out.println("How old are you?");
         age=keyboard.nextInt();
         if(age>=16 && age<=40)
         {
             System.out.println("\"Welcome to the store you can use our service with a 30% discount.\"");
         
         }
     }
  }

}




