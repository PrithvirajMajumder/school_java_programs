package inheritence;
class Compute extends Library
{
    int d;
    double f;
    Compute(String n, String a, double p, int d)
    {
        super(n, a, p);
        this.d = d;
    }
    
    void fine()
    {
        if(d > 1 + 7 && d <= 5 + 7)
        {
            this.f = 2 * (this.d - 7);
        }
        else if(d > 6 + 7 && d <= 10 + 7)
        {
            this.f = 3 * (this.d - 7);
        }
        else if(d > 10 + 7)
        {
            this.f = 5 * (this.d - 7);
        }
    }
    
    void display()
    {
        double amt;
        amt = (this.price * 2 / 100) + this.f;
        super.show();
        super.sop("\nNo. of days the book had been taken is " + this.d);
        super.sop("\nThe fine is " + this.f);
        super.sop("\nThe total amount that " + this.name + " have to pay is " + amt);
    }
}