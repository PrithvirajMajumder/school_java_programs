package ClassProgs;
import java.util.Scanner;
/**
 * Write a description of class fds here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    int pan;
    String name;
    double tax, taxIncome;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the tax payer : ");
        this.name = sc.nextLine();
        System.out.print("Enter the Pan No. of the tax payer : ");
        this.pan = sc.nextInt();
        System.out.print("Enter the Income of the tax payer : ");
        this.taxIncome = sc.nextDouble();
    }
    void cal()
    {
        if(taxIncome > 250000)
        {
            tax = 25000 + (30 * taxIncome / 100);
        }
        else if(taxIncome >= 150001 || taxIncome < 250000)
        {
            tax = 5000 + (20 * taxIncome / 100); 
        }
        else if(taxIncome >= 100001 || taxIncome < 150000)
        {
            tax = 10 * taxIncome / 100;
        }
        else
        {
            tax = 0;
        }
    }
    void display()
    {
        System.out.print("Name = " + name + "\n Pan No. " + pan );
        System.out.print("\n The tax amount of " + name + " is " + tax);
    }
    public static void main()
    {
        Employee employee = new Employee();
        employee.input();
        employee.cal();
        employee.display();
    }
}
