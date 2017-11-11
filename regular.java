import java.util.Scanner;
class regular extends Employee_3
{
    Scanner sc = new Scanner(System.in);
    String Designation;
    int NetPay, DA, HRA, PF, NP;
    public void read1()
    {
        System.out.println("\nEnter the Designation of " + nm + " : ");
        Designation = sc.nextLine();
    }
    
    public void cal_salary()
    {
        if(BasicPay<3000)
        {
            DA = BasicPay * 10 / 100;
        }
        else
        {
            DA = BasicPay * 20 /100;
        }
        
        HRA = BasicPay * 10 / 100;
        PF = BasicPay * 10 / 100;
        
        if(HRA>=500 && HRA<=3000)
        {
            NetPay = BasicPay + DA + HRA - PF;
        }
        else
        {
            NetPay = BasicPay + DA + 3000 - PF;
        }
    }
    
    public void display1()
    {
        System.out.print("\nThe Designation of  : " + Designation + "\nThe Net Pay of  : " + NetPay);
    }
}