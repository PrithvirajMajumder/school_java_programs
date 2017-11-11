import java.util.Scanner;
class Armstrong_8
{
    public boolean Armstrong(int n)
    {
        int rem, sum=0, temp = n;
        while(n>0)
        {
            rem = n%10;
            sum+=rem*rem*rem;
            n/=10;
        }
        return temp == sum;
    }
    public void display()
    {
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.print("Enter the number you want to check : ");
        num = sc.nextInt();
        if(Armstrong(num))
        {
            System.out.println("1");
        }
        else 
        {
            System.out.println("0");
        }
    }
}