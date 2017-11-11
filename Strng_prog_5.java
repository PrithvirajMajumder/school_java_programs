import java.util.Scanner;
class Strng_prog_5
{
    String getReverseWord(String n)
    {
        int i;
        String newWord = "";
        for(i=n.length()-1; i>=0; i--)
        {
            newWord+= n.charAt(i);
        }
        return newWord;
    }
    void display()
    {
        Scanner sc = new Scanner(System.in);
        int i, count=0;
        char ch;
        System.out.print("Enter a Sentence : ");
        String str = sc.nextLine();
        String str2 = getReverseWord(str);      
        for(i=0; i<str.length(); i++)
        {
            if(str2.charAt(i) != str.charAt(i))
            {
                count++;
            }
        }
        System.out.print("The number of characters which are not same are " + count);        
    }
}