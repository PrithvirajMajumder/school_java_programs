import java.util.Scanner;
class Array_prog6
{
    public boolean isPrime(int n)
    {
        int count=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        return count == 2;
    }
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        int limit = 5, i;
        int numbers [] = new int [limit];
        System.out.println("Enter the numbers you want to check : ");
        for(i=0; i<=limit; i++)
        {
            if(isPrime(numbers[i]))
            {
                System.out.println("The Prime Numbers are : " + numbers[i]);
            }
        }
    }
}