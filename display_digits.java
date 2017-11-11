import java.util.Scanner;
class display_digits
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        int prod = 1;
        int n = sc.nextInt();
        int temp = n;
        while(n>0)
        {
            int rem = n%10;
            prod*=rem; // prod = prod*rem;
            n/=10; //n = n/10;
        }
        System.out.println(prod);
    }
}