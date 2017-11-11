package ClassProgs;
import java.util.Scanner;
class Increment
{
    String name;
    double basic;
    int age;
    void getData(String n, double b, int a)
    {
        name = n;
        basic = b;
        age = a;
    }
    void calculate()
    {
        double income = 0.0;
        if(age > 56)
        {
            income = basic * 20.0 / 100;
        }
        if(age > 45 && age <= 56)
        {
            income = basic * 15.0 / 100;
        }
        if(age < 45)
        {
            income = basic * 10.0 / 100;
        }
        basic += income;
    }
    void display()
    {
        System.out.print("Name = " + name + "\n" + "Age = " + age + "\n" + "Update Basic = " + basic);
    }
}