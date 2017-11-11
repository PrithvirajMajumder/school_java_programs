import java.util.Scanner;
class worker extends Employee_3
{
    Scanner sc = new Scanner(System.in);
    int extraHrs, rate;
    int wage;
    
    void read2()
    {
        System.out.print("\n\nEnter the Extra hours : ");
        extraHrs = sc.nextInt();
        System.out.print("\n\nEnter the Rate Per Hours : ");
        rate = sc.nextInt();
    }
    
    int overtime()
    {
        return extraHrs * rate;
    }
    
    public void display2()
    {
        wage = overtime() + BasicPay;
        System.out.print("\n\nWage of Overtime is " + wage);
    }
}