package inheritence;
import java.util.Scanner;
class Sales extends Representative
{
    int bno, qty;
    double pr, sales;
    String pname;
    void read(int b, int q, double p)
    {
        Scanner sc = new Scanner(System.in);
        this.sop("enter the bill no. : ");
        b = sc.nextInt();
        this.sop("enter the quantity : ");
        q = sc.nextInt();
        this.sop("enter the price : ");
        this.bno = b;
        this.qty = q;
        this.pr = p;
    }
    
    void read(double s, String pn)
    {
        Scanner sc = new Scanner(System.in);
        this.sop("Enter the ");
    }
}