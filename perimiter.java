import java.util.Scanner;
class perimiter
{
    public double getSquare(double s)
    {
        double perimeter ;
        perimeter = 4*s;
        return perimeter;
    }
    public double getRectangle(double l, double b)
    {
        double perimeter;
        perimeter = 2*(l + b);
        return perimeter;
    }
    public double getCircle(double r)
    {
        double perimeter;
        perimeter = 2 * 22/7 * r;
        return perimeter;
    }
    
    public void Display()
    {
        Scanner sc = new Scanner(System.in);
        double s, perimeter1, l, b, perimeter2, r, perimeter3;
        System.out.println("To Calculate the Perimeter of Square enter the side of Square");
        System.out.println("Side : ");
        s = sc.nextDouble();
        perimeter1 = getSquare(s);
        System.out.println("The Perimeter of the Square is : " + perimeter1);
        System.out.println("To Calculate the Perimeter of Rectangle enter the lenght and breadth of Rectangle");
        System.out.println("Length : ");
        l = sc.nextDouble();
        System.out.println("Breadth : ");
        b = sc.nextDouble();
        perimeter2 = getRectangle(l, b);
        System.out.println("The Perimeter of the Rectangle is : " + perimeter2);
        System.out.println("To Calculate the Perimeter of Circle enter the Radius of Circle");
        System.out.println("Radius : ");
        r = sc.nextDouble();
        perimeter3 = getCircle(r);
        System.out.println("The Perimter of Circle is : " + perimeter3);
    }
}