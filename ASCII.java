
//page280 q21
import java.util.Scanner;
class ASCII
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a Character: ");
        char x = sc.next().charAt(0);
        int k=(int)x;
        String op="";
        if(k>=48&&k<=57)
        {
            op="digit";
        }
        else if(k>=65&&k<=90)
        {
            op="Upper case character";
        }
        else if(k>=97&&k<=122)
        {
            op="lower case character";
        }
        else
        {
            op="Special character";
        }
        System.out.println("The charater  " + x + " is a " + op );
    }
   
}