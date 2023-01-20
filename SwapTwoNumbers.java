import java.util.Scanner;

public class SwapTwoNumbers
{
    public static void main(String[] args)
    {
        int x,a,b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("a:-"+a);
        System.out.println("b:-"+b);

        x=a;
        a=b;
        b=x;
        System.out.println("Swap numbers are a:-" + a + "     b:-" + b);
    }
}
