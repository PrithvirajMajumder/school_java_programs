package inheritence;
class Bill extends Detail
{
    int n;
    double amt;
    Bill(String name, String a, int t, int r, int n)
    {
        super(name, a, t, r);
        this.n = n;
        this.amt = 0.0;
    }
    
    void cal()
    {
        if(n <= 100)
        {
           this.amt = this.rent;
        }
        
        else if(n > 100 && n <=200)
        {
            this.amt = (0.60 * n) + this.rent; 
        }
        
        else if(n > 200 && n <= 300)
        {
            this.amt = (0.80 * n) + this.rent; 
        }
        else if (n > 300)
        {
            this.amt = n + this.rent; 
        }
    }
    
    void show()
    {
        super.show();
        super.sop("\nThe amount of " + this.name + " is " + this.amt);
    }
}