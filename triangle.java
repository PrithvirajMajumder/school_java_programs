import java.util.Scanner;
class triangle
{
    public boolean isEquilateral(int a, int b, int c)
    {
        return a==b && b==c;
    }
    public boolean isIsosceles(int a, int b, int c)
    {
        return a==b && b!=c;
    }
    public boolean isScalene(int a, int b, int c)
    {
        return a!=b && b!=c;
    }
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter the length of a side of the triangle : ");
        a=sc.nextInt();
        System.out.print("Enter the length of b side of the triangle : ");
        b=sc.nextInt();
        System.out.print("Enter the length of c side of the triangle : ");
        c=sc.nextInt();
        if(isEquilateral(a, b, c))
        {
            System.out.println("This triangle is a equilateral triangle");
        }
        else if(isIsosceles(a, b, c))
        {
            System.out.println("This triangle is a isosceles triangle");
        }
        else if(isScalene(a, b, c))
        {
            System.out.println("This triangle is a scalene triangle");
        }
    }
}