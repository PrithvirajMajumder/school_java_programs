import java.util.Scanner;
class Strng_prog_15
{
    String wordSort(String s)
    {
        char ch;
        int i, j;
        String word = "";
        for(i = 65; i<=90; i++)
        {
            for(j = 0; j < s.length(); j++)
            {
                ch = s.charAt(j);
                if(ch == (char)(i) || ch == (char)(i + 32))
                {
                    word += ch;
                }
            }
        }
        return word;
    }
    
    void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
        String sentence = sc.nextLine(), word = "", word1 = "";
        char ch, ch2;
        int i,j, k;
        sentence += " ";
        for(i = 0; i<sentence.length(); i++)
        {
            ch = sentence.charAt(i);
            if(ch != ' ')
            {
                word += ch;
            }
            else 
            {
                ch2 = word.charAt(0);
                word1 += ch2;
                word = "";
            }
        }
        System.out.print(wordSort(word1));
    }
}