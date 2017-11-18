package inheritence;

import java.util.Scanner;
class Employee
{
    String name, department;
    int salary;
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name : ");
        name = sc.nextLine();
        System.out.print("Enter the department of " + name + ": ");
        department = sc.next();
        System.out.print("Enter the salary of " + name + ": ");
        salary = sc.nextInt();
    }
    
    void display()
    {
        System.out.println("Name = " + name);
        System.out.print("\nDepartment = " + department);
        System.out.print("\nSalary = " + salary);
    }
}
