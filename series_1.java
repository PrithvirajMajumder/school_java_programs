import java.util.Scanner;
class series_1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        int n,sum=0;
        System.out.println("Enter the n limit");
        n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            sum=(i+7);
        }
        System.out.println(sum);
    }
}