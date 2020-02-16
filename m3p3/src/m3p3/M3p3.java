/*
04/10/19
 */
//Author: Edgar
package m3p3;
//Libraries:
import java.util.Scanner;
public class M3p3 {
//Global Declarations:
static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
    P4();
 }

    public static void P4(){
        int a,b,c,d,e,f;
        System.out.print("Number1 ?:");   
        a=keyboard.nextInt();
        System.out.print("Number2 ?:");
        b=keyboard.nextInt();
        if(a==1&&b==1){
        c=10;
        }
        if(a==1&&b==0)
        {  
        d=1;
        }   
         if(a==0&&b==0)
        {  
        e=0;
        }      
         if(a==0&&b==1)
        {  
        f=1;
        }    
         else{
             System.out.println("Please enter a number that has a 1 or a 0");
         }
         
}
}

