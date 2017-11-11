/**
 * Code a program in java using a class with the following specifications :
 * class name Pay 
 * datat members/instant variables : String name, float salary, da, hra, gross
 * Member Functions :
 * void inputdata() : to accept name and salary of an employee
 * void calculate() : to find the following 
 * da = 15% of salary
 * hra = 10% of salary 
 * gross = salary + da + hra
 * void output() : to display all the information
 */
package ClassProgs;
import java.util.Scanner;
class Pay
{
    String name;
    int salary;
    double da, hra, gross;
    void inputData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the employee : ");
        name = sc.nextLine();
        System.out.print("Enter the salary of the employee : ");
        salary = sc.nextInt();
    }
    
    void claculate()
    {
        da = 15 * salary / 100;
        hra = 10 * salary / 100;
        gross = da + hra + salary;
    }
    
    void outputData()
    {
        System.out.print("\n The name of the employee : " + name + "\n The basic salary of the employee is Rs. " + salary + "\n The dearness of allowence is Rs. " + da + "The house rent allowence is Rs. " + hra + "Then gross salary of the employee is Rs." + gross);
    }
}