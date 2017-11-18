package inheritence;
import java.util.Scanner;
class staff
{
    String name;
    int empCode;
    double basic;
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        name = sc.nextLine();
        System.out.print("Enter the Employee Code of " + name +": ");
        empCode = sc.nextInt();
        System.out.print("Enter the basic of " + name + ": ");
        basic = sc.nextDouble();
    }
    
    void display()
    {
        System.out.println("name = " + name);
        System.out.println("Emplyee Code = " + empCode);
        System.out.println("Basic = " + basic);
    }
}