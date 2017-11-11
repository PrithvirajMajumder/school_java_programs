import java.util.Scanner;
class Strng_prog_14
{
    void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
        String sentence = sc.nextLine(), word = "";
        char ch;
        int i;
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
                char ch2 = word.charAt(0);
                System.out.print(ch2);
                word = "";
            }
        }
    }
}