import java.util.Scanner;
class series_h
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n, a, sum=0, term=2;
        System.out.print("Emter the limit of the series : ");
        n=sc.nextInt();
        System.out.print("Enter the number : ");
        a=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            sum=sum+a*term;
            term+=2;
        }
        System.out.println(sum);
    }
}