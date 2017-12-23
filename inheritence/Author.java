package inheritence;
class Author
{
    int authorno;
    String name;
    Author()
    {
        this.name = "";
        this.authorno = 0;
    }
    Author(String nm, int an)
    {
        this.name = nm;
        this.authorno = an;
    }
    
    void sop(String s)
    {
        System.out.print(s);
    }
    
    void show()
    {
        sop("The Name of Author is " + this.authorno + "The Author No. of " + this.name + " is " + authorno);
    }
}