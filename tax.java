import java.util.Scanner;
class tax
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int a;
        System.out.println("Enter the annual income");
        a=sc.nextInt();
        double r=0.0, c=0.0, p=0.0;
        if(a<=50000)
        {
            System.out.println("No tax rate");
        }
        else if(a>50000&&a<=60000)
        {
            r=10/100;
            p=a-50000;
            c=1000;
        }
        else if(a>60000&&a<=150000)
        {
            r=20/100;
            c=1000;
            p=a-60000;
        }
        else
        {
            r=30/100;
            c=19000;
            p=a-150000;
        }
        double income_tax=(c+r*p);
        System.out.println(income_tax);
    }
}
       