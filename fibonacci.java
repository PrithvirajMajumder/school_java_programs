  //prog10 pg315
import java.util.Scanner;
class fibonacci
{
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n, a=0, b=1, c;
        System.out.println("Enter the n limit");
        n=sc.nextInt();
        System.out.print(a + " " + b + " " );
        for(int i=1; i<=n; i++)
        {
            c=a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
            
        }
    }
}