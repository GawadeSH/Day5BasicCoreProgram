import java.util.Scanner;

public class VowelOrConsonant
{
   public static void main(String[] args)
   {
       char ch;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter alphabet:-");
       ch=s.next().charAt(0);
       if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
       {
           System.out.println("alphabet  "+ch+" is vowel");
       }
       else
       {
           System.out.println("alphabet "+ch+" is consonant");

       }
   }
}
