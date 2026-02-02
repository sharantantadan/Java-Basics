import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        checkevenodd(n);
        sc.close();
    }

    static void checkevenodd(int num) {
        if (num % 2 == 0) {
            System.out.println("the given number is even");
        } else {
            System.out.println("the given number is odd");
        }
    }
}