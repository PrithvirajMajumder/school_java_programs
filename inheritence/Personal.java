package inheritence;
import java.util.Scanner;
class Personal
{
    String name;
    int pan, acc_no;
    double basic_pay;
    Personal(String nm, int pan, int accn, double bp)
    {
        this.pan = pan;
        this.name = nm;
        this.acc_no = accn;
        this.basic_pay = bp;
    }
    
    void sop(String s)
    {
        System.out.print(s);
    }
    
    void display()
    {
        sop("The name = " + this.name + "\nPAN No. " + this.pan + "\nAccount No. " + this.acc_no + "\nBasic Pay = " + basic_pay);
    }
}