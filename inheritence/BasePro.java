package inheritence;
import java.util.Scanner;
class BasePro
{
    double n1, n2;
    void enter()
    {
        Scanner sc =  new Scanner(System.in);
        this.n1 = sc.nextDouble();
        this.n2 = sc.nextDouble();
    }
    
    void show()
    {
        System.out.print("first number is " + this.n1 +" "+ "second number is " + this.n2);
    }
}