import java.util.Scanner;
class krishnamurty
{
    public int getFactorial (int n)
    {
        int fact = 1;
        for(int i=1; i<=n; i++)
        {
            fact*=i;
        }
        return fact;
    }
    
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        int n, rem, sum=0, temp=0;
        System.out.println("Enter the number that you want to check :");
        n=sc.nextInt();
        temp = n;
        while(n > 0)
        {
            rem = n%10;
            sum+=getFactorial(rem);
            n/=10;
        }
        
        if(temp == sum) 
        {
            System.out.println("Krishnamurty number");
        }
        else {
            System.out.println("Not a krishnamurty number");
        }
        
    }
}
