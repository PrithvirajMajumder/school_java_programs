import java.util.Scanner;
class difference
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
        double total= 0.0;
        if(a>b&&b>c)
        {
            total=a-c;
        }
        else if(b>a&&a>c)
        {
            total=b-c;
        }
        else if(c>b&&b<a)
        {
            total=c-a;
        }
        else
        {
            System.out.println("The number are invalid");
        }
        System.out.println(total);
    }
}
        