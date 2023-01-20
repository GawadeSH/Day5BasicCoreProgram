import java.util.Scanner;
import java.util.Scanner;

public class QandRemainder
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two number");
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int q=n1/n2;
        System.out.println("Quotient:-"+q);
        int r = n1%n2;
        System.out.println("Remainder:-"+r);

    }
}
