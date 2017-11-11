import java.util.Scanner;
class armstrong
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter an integer : ");
        int n=sc.nextInt();
        int rem, sum=0, temp = n;
        while(n>0)
        {
            rem = n%10;
            sum+=rem*rem*rem;
            n/=10;
        }
        
        if(temp == sum){
          System.out.print("Armstrong number");
        }
        else {
            System.out.print("Not an Armstrong number");
        }
    }
}