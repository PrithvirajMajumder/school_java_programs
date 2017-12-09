package inheritence;
import java.util.Scanner;
class Admission
{
    int limit = 5;
    int Adno[] = new int[limit];
    Admission()
    {
        for(int i = 0; i < limit; i++)
        {
            this.Adno[i] = 0;
        }
    }
    
    void fillArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter all the numbers : ");
        for(int i = 0; i < limit; i++)
        {
            this.Adno[i] = sc.nextInt();
        }
    }
    
    int binSearch(int l, int u, int v)
    {
        if(l>u)
        {
            return -1;
        }
        else
        {
            int mid = (l+u)/2;
            if(v > Adno[mid])
            {
                return(binSearch(mid + 1, u, v));
            }
            else if(v < Adno[mid])
            {
                return(binSearch(l, mid - 1, v));
            }
            else
            {
                return 1;
            }
        }
    }
    
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        Admission ad = new Admission();
        ad.fillArray();
        int start, end, item;
        start = 0;
        end = this.limit - 1;
        System.out.print("Enter the number you want to search for : ");
        item = sc.nextInt();
        if(ad.binSearch(start, end, item) == 1)
        {
            System.out.print(item + " is present in the array ");
        }
        else if(ad.binSearch(start, end, item) == -1)
        {
            System.out.print(item + " is not present in the array");
        }
    }   
}