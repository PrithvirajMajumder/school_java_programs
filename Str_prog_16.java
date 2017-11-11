import java.util.Scanner;
class Str_prog_16
{
    void charDeletion(String s)
    {
        char ch, ch1;
        int i, j;
        String word = "";
        for(i = 0; i < s.length(); i++)
        {
            ch = ' ';
            for(j = i + 1; j < s.length(); j++)
            {
                if(ch != s.charAt(j))
                {
                    System.out.print(ch);
                }
            }
        }
    }
    
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
    /*
    void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String sentence = sc.nextLine(), word = "", word1 = "", word2 = "";
        char ch;
        int i;
        for(i = 0; i < sentence.length(); i++)
        {
            ch = sentence.charAt(i);
            if(ch != ' ')
            {
                word += ch;
            }
            else
            {
                word1 += word.charAt(0);
                word = "";
            }
        }
        word2 = wordSorting(word1);
    }*/
}