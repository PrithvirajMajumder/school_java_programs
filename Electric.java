public class Electric extends Detail
{
    String bill_dt;
    int units, extraCharge = 250;
    double charges;
    Electric(String name, String add, int cmr, int pmr, String billDate)
    {
        super(name, add, cmr, pmr);
        this.bill_dt = billDate;
        this.units = this.pmr - this.cmr;
        this.charges = 0.0;
    }
    
    void diplay()
    {
        super.display();
        System.out.print("\n Bill Date = " + this.bill_dt + "\n no. of units consumed = " + this.units + "\n Charges to be paid = " + this.charges);
    }
    
    void calCharges()
    {
        if(units <= 100)
        {
            charges = 0.80 * units;
        }
        else if(units > 100 && units <= 200)
        {
            charges = (1.20 * (units - 100)) + (0.80 * 100);
        }
        else
        {
            charges = (0.80 * 100) + (1.20 * 100) + (1.50 * units - 200);
        }
        
        charges += this.extraCharge;
    }
}
