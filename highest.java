import java.util.Scanner;
class highest
{
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        int n, max = 0, pos = -1;
        System.out.print("Enter the Total no. of Elements : ");
        n = sc.nextInt();
        int SDA [] = new int[n];
        System.out.print("Enter the values : ");
        for(int i=0; i<n; i++)
        {
            SDA[i] = sc.nextInt();
        }
        
        max = SDA[0];
        
        for(int i=0; i<n; i++)
        {
            if(SDA[i] > max)
            {
                max = SDA[i];
                pos = i;
            }
        }
        
        System.out.print("Highset element is : " + SDA[pos]);
    }
}