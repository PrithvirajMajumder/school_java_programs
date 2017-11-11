import java.util.Scanner;
class Strng_prog_7
{
    String reverse(String n)
    {
        String n2 = "";
        char ch;
        int i;
        for(i=n.length(); i>0; i--)
        {
            ch = n.charAt(i);
            n2 += ch;
        }
        return n2;
    }
    
    void display()
    {
        Scanner sc = new Scanner(System.in);
        String sentence;
        char chr;
        int i, count = 0;
        System.out.print("Enter a sentence : ");
        sentence = sc.nextLine();
        sentence = " " + sentence;
        for(i = 0; i<sentence.length(); i++)
        {
            chr = sentence.charAt(i);
            if(chr == ' ')
            {
                count++;
            }
            if(count == 3)
            {
                System.out.print(chr);
            }
        }
        count = 0;
        for(i = 0; i<sentence.length(); i++)
        {
            chr = sentence.charAt(i);
            if(chr == ' ')
            {
                count++;
            }
            
            if(count <= 2)
            {
                System.out.print(chr);
            }
        }
    }
}