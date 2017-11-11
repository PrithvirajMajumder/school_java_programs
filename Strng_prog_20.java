import java.util.Scanner;
class Strng_prog_20
{
    String reverse(String n)
    {
        String n2 = "";
        char ch;
        int i;
        for(i=n.length() - 1; i>=0; i--)
        {
            ch = n.charAt(i);
            n2 += ch;
        }
        return n2;
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
                System.out.print(reverse(word) + " ");
                word = "";
            }
        }
    }
}
