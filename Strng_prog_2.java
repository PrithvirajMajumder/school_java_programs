import java.util.Scanner;
class Strng_prog_2
{
    void display()
    {
        Scanner sc = new Scanner(System.in);
        int i, count_a = 0, count_e = 0, count_i = 0, count_o = 0, count_u = 0;
        char ch;
        System.out.print("Enter a Sentence : ");
        String str = sc.nextLine();
        for(i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            // System.out.println("The char is: " + ch);
            if(ch == 'a' || ch == 'A')
            {
                count_a++;
            }
            if(ch == 'e' || ch == 'E')
            {
                count_e++;
            }
            if(ch == 'i' || ch == 'I')
            {
                count_i++;
            }
            if(ch == 'o' || ch == 'O')
            {
                count_o++;
            }
            if(ch == 'u' || ch == 'U')
            {
                count_u++;
            }
        }
        System.out.println("The frequency of a is " + count_a);
        System.out.println("The frequency of e is " + count_e);
        System.out.println("The frequency of i is " + count_i);        
        System.out.println("The frequency of o is " + count_o);        
        System.out.println("The frequency of u is " + count_u);        
    }
}