 import java.util.Scanner;
class series_f
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n, term = 2, sum = 0;
        System.out.print("Enter the limit of the series: ");
        n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            if(i%2 == 0){
                sum-=term;
            } else {
                sum+=term;
            }
            term*=2;
        }
        System.out.println(term);
    }
}