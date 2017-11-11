import java.util.Scanner;
class syndicate
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int l,t;
        System.out.println("Enter the loan amount");
        l=sc.nextInt();
        System.out.println("Enter the time");
        t=sc.nextInt();
        int e,m;
        if(t==10)
        {
            e=1225;
            m=120;
        }
        else if(t==15)
        {
            e=1175;
            m=180;
        }
        else
        {
            e=1100;
            m=240;
        }
        double total =(e*m);
        System.out.println(total);
    }
}
