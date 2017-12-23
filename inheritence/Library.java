package inheritence;
class Library
{
    String name, author;
    double price;
    Library(String n, String a, double p)
    {
        this.name = n;
        this.author = a;
        this.price = p;
    }
    
    void sop(String s)
    {
        System.out.print(s);
    }
    
    void show()
    {
        sop("\nThe name of the book taker is " + this.name);
        sop("\nThe Author of the book is " + this.author);
        sop("\nThe price of the book is " + this.price);
    }
}