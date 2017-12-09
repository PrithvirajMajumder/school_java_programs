package ClassProgs;
import java.util.Scanner;
class Disarium
{
    int num, size;
    Disarium(int nn)
    {
        num = nn;
        size = 0;
    }
    void countDigit()
    {
        int cache = num;
        while(cache>0)
        {
            size ++;
            cache /= 10;
        }
    }
    int sumOfDigits()
    {
        int i, p = 0;
        for(i = 0; i <= this.size; i++)
        {
            p += Math.pow(num, i);
        }
        return p;
    }
}