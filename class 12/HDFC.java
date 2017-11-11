import java.util.Scanner;
class HDFC
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int p,t;
        System.out.println("Enter the principal");
        p=sc.nextInt();
        System.out.println("Enter the time");
        t=sc.nextInt();
        double r;
        if(t<=6)
        {
            r=5;
        }
        else if(t>6&&t<=12)
        {
            r=7;
        }
        else if(t>12&&t<=24)
        {
            r=8;
        }
        else if(t>24&&t<36)
        {
            r=9;
        }
        else
        {
            r=9.5;
        }
        double si=(p*r*t)/100;
        System.out.println(si);
    }
}