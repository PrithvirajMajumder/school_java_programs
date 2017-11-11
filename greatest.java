import java.util.Scanner;
class greatest
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int a,b,c;
        System.out.println("Enter the first number");
        a=sc.nextInt();
        System.out.println("Enter the second number");
        b=sc.nextInt();
        System.out.println("Enter the third number");
        c=sc.nextInt();
        if(a>b&&b>c)
        {
            System.out.println("the greatest number is"+a);
        }
        else if(b>a&&a>c)
        {
            System.out.println("the greatest number is"+b);
        }
        else if(c>a&&a>b)
        {
            System.out.println("the greatest number is"+c);
        }
        else
        {
            System.out.println("the number is invalid");
        }
    }
}