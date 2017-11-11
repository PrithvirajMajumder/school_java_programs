class Arr_Del_Function
{
    int [] Deletion(int n[])
    {
        int i, j, limit = n.length;
        int Arr [] = new int [limit];
        for(i=0; i<limit; i++)
        {
            for(j=i+1; j<limit; i++)
            {
                if(n[i] == n[j])
                {
                    n[j] = 0;
                }
            }
        }
        
        j=0;
        for(i=0; i<limit; i++)
        {
            if(n[i]!=0)
            {
                Arr[j]=n[i];
                j++;
            }
        }
        return Arr;
    }
}