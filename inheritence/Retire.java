package inheritence;
class Retire extends Personal
{
    int yrs;
    double pf, grat;
    Retire(String nm, int accn, int pan, double bp, int yrs)
    {
        super(nm, accn, pan, bp);
        this.yrs = yrs;
    }
    
    void provident()
    {
        this.pf = (this.basic_pay * 2 / 100) * this.yrs;
    }
    
    void gratuity()
    {
        if(this.yrs > 10)
        {
            this.grat = 100000;
        }
        
        else if(this.yrs <= 10)
        {
            this.grat = 0;
        }
    }
    
    void display()
    {
        super.display();
        this.sop("\nNo. of years service of " + this.name + " is " + this.yrs);
        this.sop("\nThe provident of " + " is " + this.pf);
        this.sop("\nThe Gratuity of" + " is " + this.grat);
    }
}