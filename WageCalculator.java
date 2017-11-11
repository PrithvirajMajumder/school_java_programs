class WageCalculator
{
    public static void main()
    {
        regular R = new regular();
        Employee_3 E = new Employee_3();
        worker W = new worker();
        E.read();
        R.read1();
        W.read2();
        E.display();
        R.display1();
        W.display2();
    }
}