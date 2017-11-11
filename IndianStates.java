import java.util.Scanner;
class IndianStates
{
    /*int[] bubbleSort(int n[], boolean ascending)
    {
        int limit = n.length, i, j, t;
        for(i = 0; i<(limit-1); i++)
        {
            for(j = 0; j<(limit-1)-i; j++)
            {
                if(ascending)
                {
                  if(n[j]>n[j+1])
                    {
                        t=n[j];
                        n[j] = n[j + 1];
                        n[j+1]= t;
                    }  
                }
            }
        }
        return  n;
    }*/
    
    void display()
    {
        Scanner sc = new Scanner(System.in);
        int i, j, limit = 5, storevalue;
        String states[] = new String[limit];
        for(i=0; i<limit; i++)
        {
            states[i] = sc.nextLine();
        }
        
        for(i=0; i<limit-1; i++)
        {
            storevalue = i;
            for(j=i; j<limit; j++)
            {
                
            }
        }
    }
}