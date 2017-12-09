package inheritence;
class Bank
{
    String name;
    int accNo;
    double p;
    Bank(String n, int acn, double p)
    {
        this.name = n;
        this.accNo = acn;
        this.p = p;
    }
    
    void display()
    {
        System.out.print("The account holder = " + this.name);
        System.out.print(" Account No. is " + this.accNo);
        System.out.print(" and principle amount is " + this.p);
    }
}