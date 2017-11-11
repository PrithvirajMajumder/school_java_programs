import java.util.Scanner;
class series
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int x=1, sum=0,i,n;
        System.out.println("Enter the limit");
        n=sc.nextInt();
        for(i=10; i>=n; i--)
        {
            sum+=(i+x);
        }
        System.out.println(sum);
    }
}
