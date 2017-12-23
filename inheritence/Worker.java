package inheritence;
import java.util.Scanner;
class Worker
{
    String name;
    double basic;
    Worker(String n, double b)
    {
        this.name = n;
        this.basic = b;
    }
    
    void sop(String s)
    {
        System.out.print(s);
    }
    
    void display()
    {
        sop("\nThe name of the worker : " + this.name);
        sop("\nThe basic pay of " + this.name + " is " + this.basic);
    }
}