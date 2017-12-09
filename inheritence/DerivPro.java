package inheritence;
class DerivPro extends BasePro
{
    double result, prod;
    void prod()
    {
        prod = this.n1 * this.n2;
    }
    void display()
    {
        System.out.print("The product of " + n1 + " and " + n2 + " is " + prod);
    }
}