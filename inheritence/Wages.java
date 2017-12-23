package inheritence;
class Wages extends Worker
{
    double hrs, rate, wage, overtime_money;
    Wages(String n, double b, double h, double r)
    {
        super(n, b);
        this.hrs = h;
        this.rate = r;
    }
    
    double overtime()
    {
        overtime_money = this.hrs * this.rate;
        return overtime_money;
    }
    
    void display()
    {
        this.wage = overtime() + this.basic;
        super.display();
        super.sop("\nThe wage of " + this.name + " with overtime amount is " + this.wage);
    }
}