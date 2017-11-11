// prog 15 pg 315
class square
{
    public static void main(String[]args)
    {
        int number;
        for(int i=5; i<=500; i++)
        {            
            number = i;   
            int sqRoot = (int) Math.sqrt(number);
            if(sqRoot * sqRoot == number)
            {
                System.out.print(number + ", ");
            }
        }
        
    }
}
        