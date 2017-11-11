import java.util.Scanner;
class Even
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int temp = n, pos=1;
        while(n>0)
        {
            int rem = n%10;
            if(pos % 2 != 0)
            {
                System.out.println(rem);
            }
            n/=10; //n = n/10;
            pos++; // go to next position
        }
    }
}