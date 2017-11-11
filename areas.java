import java.util.Scanner;
class areas
{
    public double getParallel(double b, double h)
    {
        double area ;
        area = b*h;;
        return area;
    }
    public double getRohmbus (double d1, double d2)
    {
        double area;
        area = 1/2 * d1 * d2;
        return area;
    }
    public double getTrap(double a, double b)
    {
        double area, h;
        h = a-b;
        area = 1/2 * (a + b) * h;
        return area;
    }
    public void Display()
    {
        Scanner sc = new Scanner(System.in);
        double b, h, area1, d1, d2, area2, a, b1, area3;
        System.out.println("1. Area of Parallelogram\n2. Area of Rohmbus\n3. Area of Trapezium\n4. Exit ");
        int ch = sc.nextInt();
        if(ch == 1){
            System.out.println("Base : ");
            b = sc.nextDouble();
            System.out.print("Height : ");
            h = sc.nextDouble();
            area1 = getParallel(b, h);
            System.out.println("The area of the Parallelogram is : " + area1);
        }
        else if(ch ==2 ){
            System.out.println("To Calculate the area of Rohmbus enter the two Diagonals of Rohmbus");
            System.out.println("Dimension 1 : ");
            d1 = sc.nextDouble();
            System.out.println("Dimension 2 : ");
            d2 = sc.nextDouble();
            area2 = getRohmbus(d1, d2);
            System.out.println("The Area of the Rohmbus is : " + area2);
        }
        else if(ch == 3)
        {
            System.out.println("To Calculate the area of Rohmbus enter the two Parallel Side of Trapezium");
            System.out.println("Parallel Side 1 : ");
            a = sc.nextDouble();
            System.out.println("Parallel Side 2 : ");
            b1 = sc.nextDouble();
            area3 = getTrap(a, b1);
            System.out.println("The area of Trapezium is : " + area3);
        }
        else if(ch==4)
        {
            System.out.println("Exiting the program ");
        }
        else 
        {
            System.out.println("Wrong Choice");
        }
    }
}
