package inheritence;
class Detail
{
    String name, address;
    int telno, rent;
    Detail(String name, String add, int tell, int rent)
    {
        this.name = name;
        this.address = add;
        this.telno = tell;
        this.rent = rent;
    }
    
    void sop(String message)
    {
        System.out.print(message);
    }
    
    void show()
    {
        sop("Name = " + name + "\nAdress = " + address + "\nTelephone No. = " + telno + "\nRent = " + rent);
    }
}