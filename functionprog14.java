import java.util.Scanner;
class functionprog14
{
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double x1, x2, d;
        System.out.print("Enter the value of a : ");
        a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        c = sc.nextInt();
        d = Math.pow(b, 2) - 4 * a * c;
        if(d>=0)
        {
            x1 = (-b + Math.sqrt(d)) / 2*a;
            x2 = (-b - Math.sqrt(d)) / 2*a;
            System.out.println("The Roots are " + x1 + ", " + x2);
        }
        if(d<0)
        {
            System.out.println("Roots are not possible");
        }
    }
}