package inheritence;
class Booklist extends Author
{
    long bookno;
    String bookname;
    double price;
    int edition;
    Booklist(String name, int authorno, String bn, long bno, double p, int edi)
    {
        super(name, authorno);
        this.bookname = bn;
        this.bookno = bno;
        this.price = p;
        this.edition = edi;
    }
    
    void display()
    {
        super.show();
        this.sop("\nThe Book name = " + this.bookname);
        this.sop("\nThe Book No. " + this.bookno);
        this.sop("\nThe Price of the book = " + this.price);
        this.sop("\nThe edition of book = " + this.edition);
    }
}