import java.util.Scanner;
class Strng_prog_10
{
    void display()
    {
        Scanner sc = new Scanner(System.in);
        String sentence;
        char ch;
        int i;
        System.out.print("Enter a sentence : ");
        sentence = sc.nextLine();
        for(i=0; i<sentence.length(); i++)
        {
            ch = sentence.charAt(i);
            if(Character.isUpperCase(ch))
            {
                System.out.print(Character.toLowerCase(ch));
            }
            if(Character.isLowerCase(ch))
            {
                System.out.print(Character.toUpperCase(ch));
            }         
        }
    }
}