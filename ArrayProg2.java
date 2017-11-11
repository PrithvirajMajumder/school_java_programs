import java.util.Scanner;
class ArrayProg2
{
    public boolean isNegetiveOdd(int n)//calculation functions
    {
         return n<0 && n%2!=0;
    }
    public boolean isNegetiveEven(int n)//calculation functions
    {
       return n<0 && n%2==0;
    }
  
    public boolean isPositiveOdd(int n)//calculation functions
    {
        return n>0 && n%2!=0;
    }
   
    public boolean isPositiveEven(int n)//calculation functions
    {
        return n>0 && n%2==0;
    }
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        int limit = 5, sum1=0, sum2=0, sum3=0, sum4=0;
        int n[] = new int [limit];
        System.out.print("Enter the nunbers : ");
        for(int i=0; i<limit; i++)
        {
            n[i] = sc.nextInt();
            if(isNegetiveOdd(n[i]))
            {
                sum1+=n[i];
            }
            if(isNegetiveEven(n[i]))
            {
                sum2+=n[i];
            }
            if(isPositiveOdd(n[i]))
            {
                sum3+=n[i];
            }
            if(isPositiveEven(n[i]))
            {
                sum4+=n[i];
            }
        }
        System.out.println("The sum of all negetive odd numbers = " + sum1);
        System.out.println("The sum of all negetive even numbers = " + sum2);
        System.out.println("The sum of all positive odd numbers = " + sum3);
        System.out.println("The sum of all positive even numbers = " + sum4);
    }
}