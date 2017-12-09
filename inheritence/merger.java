package inheritence;
import java.util.Scanner;
class merger
{
    long n1, n2, mergeNum;
    merger()
    {
        this.n1 = 0;
        this.n2 = 0;
        this.mergeNum = 0;
    }
    
    void readNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        this.n1 = sc.nextLong();
        System.out.print("Enter the second number : ");
        this.n2 = sc.nextLong();
    }
    
    void joinNum()
    {
        int p = 1;
        long t = n2;
        while(t > 0)
        {
            p *= 10;
            t /= 10;
        }
        mergeNum = n1 * p+n2;
    } 
    
    void display()
    {
        System.out.print("\n\nThe first no. is " + n1 + "\nThe second no. is " + n2);
        System.out.print("\nThe Merged Number is " + mergeNum);
    }
    
    void main()
    {
        merger m = new merger();
        m.readNum();
        m.joinNum();
        m.display();
    }
}