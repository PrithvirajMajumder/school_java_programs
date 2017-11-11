import java.util.Scanner;
class Str_prog_22
{
    String delSpaces(String s)
    {
        String word = "", sentence = "";
        char ch;
        int i;
        for(i = 0; i < s.length(); i++)
        {
            ch = s.charAt(i);
            if(ch != ' ')
            {
                word += ch;
            }
            else
            {
                sentence += word;
                word = "";
            }
        }
        return sentence;
    }
    
    
    void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String s = sc.nextLine(), sentence = "", word = ""; 
        int i, j, count = 1;
        char ch, ch1;
        s += " ";
        sentence = delSpaces(s);
        
        for(i = 0; i < sentence.length(); i++)
        {
            
            ch = sentence.charAt(i);
            
            for(j = i +1; j < sentence.length(); j ++)
            {
                if(ch == sentence.charAt(j))
                {
                    count ++;
                }
            }
            
            if(count > 1)
            {
                System.out.println("frequency of " + ch + " is " + count);
            }
            count = 1;
        }
        
    }
}