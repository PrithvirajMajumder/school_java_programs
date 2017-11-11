package ClassProgs;
import java.util.Scanner;
class ClsProg6
{
    String name, address, city;
    double salary, net;
    ClsProg6(String n, String add, String cy, double s)
    {
        this.name = n;
        this.address = add;
        this.city = cy;
        this.salary = s;
    }
    void outputData()
    {
        System.out.print("\nName: " + name + "\nAddress = " + address + "\nCity " + city + "\nSalary " + salary);
    }
    void calculate()
    {
        double da = 15*salary/100, hra = 10*salary/100, pf = 12*salary/100, gross = salary + da + hra; 
        net = gross - pf;
    }
    void display()
    {
        System.out.print("\nName: " + name + "\nAddress = " + address + "\nCity " + city + "\nNet Salary of " + name + " is " + net);
    }
}