package ClassProgs;
import java.util.Scanner;
public class Employees
{
    int pan;
    String name;
    double tax, taxIncome;
    
    Employees(String n, int pan, double tIncome)
    {
        this.name = n;
        this.pan = pan;
        this.taxIncome = tIncome;
    }
    
    void cal()
    {
        int taxPercentage = 0, taxConstant = 0;
        if(this.taxIncome > 250000)
        {
            taxPercentage = 30;
            taxConstant = 25000;
        }
        else if(this.taxIncome >= 150001 || this.taxIncome < 250000)
        {
            taxPercentage = 20;
            taxConstant = 5000;
        }
        else if(this.taxIncome >= 100001 || this.taxIncome < 150000)
        {
            taxPercentage = 10;
        }
        this.tax = taxConstant +  (taxPercentage * this.taxIncome) / 100;
    }
    
    void display()
    {
        System.out.print("Name = " + name + "\n Pan No. " + pan );
        System.out.print("\n The tax amount of " + name + " is " + tax);
        System.out.println(this.pan + "\t " + this.name + "\t " + this.taxIncome + "\t " + this.tax);
    }
    
    public static void main()
    {
        String name;
        int pan;
        double taxIncome;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total no. of employees : ");
        int limit = sc.nextInt();
        Employees [] employeeList = new Employees [limit];

        for(int i = 0; i < employeeList.length; i++)
        {
            System.out.print("\nEnter the name of the tax payer : ");
            name = sc.next();
            System.out.print("\nEnter the Pan No." + name + ": ");
            pan = sc.nextInt();
            System.out.print("\nEnter the Income of: " + name + ": ");
            taxIncome = sc.nextDouble();
            employeeList[i] = new Employees(name, pan, taxIncome);
            employeeList[i].cal();
        }
        
        System.out.println("\nPan Number \t\t Name \t Tax-Income \t Tax\n");
        for(int i = 0; i < employeeList.length; i++)
        {
            employeeList[i].display();
        }
    }
    
}
