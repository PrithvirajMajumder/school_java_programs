import java.util.Scanner;
class smallest
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int a,b,c;
        System.out.println("The enter the first number");
        a=sc.nextInt();
        System.out.println("The enter the second number");
        b=sc.nextInt();
        System.out.println("The enter the third number");
        c=sc.nextInt();
        if(a>b&&b>c)
        {
            System.out.println("The second smallest number is"+b);
        }
        else if(b>a&&a>c)
        {
            System.out.println("The second smallest number is"+a);
        }
        else if(b>c&&c>a)
        {
            System.out.println("The second smallest number is"+c);
        }
        else
        {
            System.out.println("The number is invalid");
        }
    }
}

        