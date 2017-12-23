package inheritence;
class derive extends base
{
    int hc, lc, temp;
    void Swap()
    {
        super.accept();
        if(this.n1 < this.n2)
        {
            temp = this.n1;
            this.n1 = this.n2;
            this.n2 = temp;
        }
    }
    
    void findHCF()
    {
        int a, b;
        a = this.n1;
        b = this.n2;
        while(b != 0)
        {
            temp = b;
            b = a%b;
            a = temp;
        }
        this.hc = a;
    }
    
    void findLCM()
    {
        this.lc = (n1 * n2) / this.hc;
    }
    
    void display()
    {
        super.display();
        super.sop("\nThe first two numbers are " + n1 + " and " + n2);
        super.sop("\nHCF of " + n1 + " and " + n2 + " is " + hc);
        super.sop("\nLCM of " + n1 + " and " + n2 + " is " + lc);
    }
}