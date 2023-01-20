import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}