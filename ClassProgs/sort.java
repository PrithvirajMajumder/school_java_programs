package ClassProgs;
import java.util.Scanner;
class sort
{
    int n [] = new int [10];
    void inputData()
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Enter 10 numbers : ");
        for(i = 0; i < 10; i++)
        {
            n[i] = sc.nextInt();
        }
    }
    void arrange()
    {
        int limit = n.length, i, j, t;
        for(i = 0; i<(limit-1); i++)
        {
            for(j = 0; j<(limit-1)-i; j++)
            {
                if(n[j]>n[j+1])
                {
                    t=n[j];
                    n[j] = n[j + 1];
                    n[j+1]= t;
                }
            }
        }
        for(i = 0; i < limit; i ++)
        {
            System.out.print(n[i] + " ");
        }
    }
    void search()
    {
        Scanner sc = new Scanner(System.in);
        int limit = n.length, start = 0, mid = 0, end = 0, pos = -1, i, item;
        end = limit - 1;
        System.out.print("Enter the no. you wnat to search : ");
        item = sc.nextInt();
        while(start<=end)
        {
            mid = (start + end) / 2;
            if(n[mid] == item)
            {
                pos = mid;
                break;
            }
            
            if(n[mid]<item)
            {
                end = mid + 1;
            }
            
            if(n[mid]>item)
            {
                start--;
            }
        }
        if(pos >= 0 || pos < limit)
        {
            System.out.print("Yes the no. is present in " + pos);
        }
        else
        {
            System.out.print("The no. is not present");
        }
    }
}