import java.util.Scanner;
import java.lang.Math;
public class LargestNumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 number");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int x = Math.max(a,b);          //find largest number between 3 number using Math.max() method
        int y = Math.max(b,c);

        System.out.println("largest Number:-"+Math.max(x,y));
    }
}
