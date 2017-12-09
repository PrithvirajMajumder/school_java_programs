
/**
 * Write a description of class Detail here.
 *
 * @author (prithviraj)
 * @version (1.0.0)
 */
class Detail
{
    // instance variables - replace the example below with your own
    String C_name, C_address;
    int pmr, cmr;
    
    /**
     * Constructor for objects of class Detail
     */
    public Detail(String name, String address, int pmr, int cmr)
    {
        // initialise instance variables
        this.C_name = name;
        this.C_address = address;
        this.pmr = pmr;
        this.cmr = cmr;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    void display()
    {
        System.out.print("\n Name = " + this.C_name + "\n Address = " + this.C_address + "\n previous meter reading = " +  this.pmr + 
        "\n current previous reading = " + this.cmr);
    }
}

