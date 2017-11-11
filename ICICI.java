import java.util.Scanner;
class ICICI
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int p,t;
        System.out.println("Enter the principal");
        p= sc.nextInt();
        System.out.println("Enter the time");
        t=sc.nextInt();
        double r;
        if(t<1)
        {
            r=5/100;
        }
        else if(t>1 && t<=2)
        {
            r=6.5/100;
        }
        else if(t>2 && t<=3)
        {
            r=7.5/100;
        }
        else
        {
            r=8.5/100;
        }
        double a=(Math.pow (p*1+r,t));
        System.out.println(a);
    }
}