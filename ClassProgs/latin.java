package ClassProgs;
import java.util.Scanner;
class latin
{
    String name;
    latin()
    {
        name = " ";
    }
    void input(String name)
    {
        int x, y, z, m, p;
        String a, c, d; 
        a = "";
        char b, ch; 
        b = 0;
        ch = 0;
        name += ' ';
        p = name.length();
        System.out.print("Piglatin form of the word is");
        for(m = 0; m < p; m++)
        {
            ch = name.charAt(m);
            if(ch == ' ')
            {
                x = a.length();
                for(y = 0; y < x; y++)
                {
                    b = a.charAt(y);
                    if(b== 'a' || b== 'e' || b== 'i' || b== 'o' || b== 'u' ||
                       b== 'A' || b== 'E' || b== 'I' || b== 'O' || b== 'U')
                    {
                        break;
                    }
                }
                c = a.substring(y, x);
                d = a.substring(0, y);
                System.out.print(c + d + "ay" + ' ');
            }
            else
            {
                a += ch;
            }
        }
    }
}