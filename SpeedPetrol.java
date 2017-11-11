// prog 29 pg 316
import java.util.Scanner;
class SpeedPetrol
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        double litre, price, petrol;
        System.out.print("Enter the amount of petrol you want : ");
        litre=sc.nextDouble();
        System.out.print("Enter the amount of petrol you want in rs : ");
        price=sc.nextDouble();
        if(litre>0 && price<=0)
        {
            petrol= litre * 48.5;
            System.out.println("Your total amount is " + petrol); 
        }
        else if(price>0 && litre<=0)
        {
            double petrol_1 = price * 4.85;
            System.out.print("Your total amount is " + petrol_1); 
        }
    }
}