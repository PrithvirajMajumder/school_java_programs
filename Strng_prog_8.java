//vowel checking in a sentence
import java.util.Scanner;
class Strng_prog_8
{
    boolean isVowel (char ch)
    {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    void display()
    {
        Scanner sc = new Scanner(System.in);
        String sentence ,word = "";
        char ch;
        int i;
        System.out.print("Enter a sentence : ");
        sentence = sc.nextLine();
        sentence += " ";
        for(i=0; i<sentence.length(); i++)
        {
            ch=sentence.charAt(i);
            if(ch != ' ')
            {
                word+=ch;
            }
            else
            {                
                if(isVowel(word.charAt(0)))
                {
                    System.out.print(" an " + word);
                }
                else
                {
                    System.out.print(" " + word);
                }
                word = "";
            }
        }
    }
}