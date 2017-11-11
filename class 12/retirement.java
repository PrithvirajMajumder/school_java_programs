import java.util.Scanner;
class retirement
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        double a,b;
        System.out.println("Enter the age");
        a=sc.nextInt();
        System.out.println("Enter the base");
        b=sc.nextInt();
        double r=0.0,da=0.0;
        if(a<=40)
        {
            r=1.1/100;
            da=20/100;
        }
        else if(a>40&&a<=50)
        {
            r=1.25/100;
            da=30/100;
        }
        else if(a>50&&a<=60)
        {
            r=1.5/100;
            da=40/100;
        }
        double salary=(b*r+da);
        System.out.println(salary);
    }
}