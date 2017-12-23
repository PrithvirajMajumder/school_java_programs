package inheritence;
import java.util.Scanner;
class base
{
    int n1, n2;
    void sop(String s)
    {
        System.out.print(s);
    }
    
    
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        sop("Enter the first number : ");
        n1 = sc.nextInt();
        sop("Enter the second number : ");
        n2 = sc.nextInt();
    }
    
    void display()
    {
        sop("The first number is " + n1);
        sop("     The second number is " + n2);
    }
}