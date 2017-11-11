
//prog 13 pg 315
import java.util.Scanner;
class palindrome
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n, r, temp, sum=0;
        System.out.print("Enter a number to check for palindrome: ");
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n/=10;
        }
        
        if(temp == sum) {
            System.out.print("It is a Palindrome number");
        } else {
            System.out.print("It is not a palindrome");
        }
    }
}