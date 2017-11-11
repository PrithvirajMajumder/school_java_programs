import java.util.Scanner;
class palindrome_5
{
    public boolean Palin(int n)
    {
        int r, temp, sum=0;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n/=10;
        }
        return sum == temp;
    }
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the number you want to check : ");
        num=sc.nextInt();
        if(Palin(num))
        {
            System.out.println(num + " is a plaindrome number");
        }
        else
        {
            System.out.println(num + " is not a plaindrome number");
        }
    }
}
