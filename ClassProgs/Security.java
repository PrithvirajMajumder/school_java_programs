package ClassProgs;
import java.util.Scanner;
class Security
{
    String n;
    int  h;
    double r, w;
    void get(String name, int hour, double rate)
    {
        n = name;
        h = hour;
        r = rate;
    }
    
    void calwage()
    {
        if(h <= 40)
        {
            w = r * 40.0;
        }
        if(h > 40 && h <= 60)
        {
            w = (h - 40) * 1.5 * r + 40*r;
        }
        if(h > 60)
        {
            w = (h - 60) * 2 * r + 20 * 1.5 * r + 40*r;
        }
    }
    void display()
    {
        System.out.print("Name" + "\t" + "Hours" + "\t" + "Wage");
        System.out.print(n + "\t" + h + "\t" + w);
    }
}