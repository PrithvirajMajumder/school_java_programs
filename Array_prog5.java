import java.util.Scanner;
class Array_prog5
{
    public double getFarhenheit(double c)
    {
        double f = c*9/5 + 32;//(°C × 9/5) + 32 = °F
        return f;
    }
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        int limit = 5, i;
        double farhenheit = 0.0, bodyTempInFah = 98.6;
        double celcius [] = new double [limit];
        System.out.println("Enter " + limit + " differmet temperatures in celcius : ");
        for(i=0; i<limit; i++)
        {
            celcius[i] = sc.nextDouble();
        }
        System.out.println("The temperatures which is greater than the normal body temperature are : ");
        for(i=0; i<limit; i++)
        {
            farhenheit = getFarhenheit(celcius[i]);
            if(farhenheit > bodyTempInFah)
            {
                System.out.println(farhenheit);
            }
        }
    }
}