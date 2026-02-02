import java.util.Scanner;

public class maxof3 {
    static int maxofthree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 3 integers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = maxofthree(a, b, c);
        System.out.println("the Maximum of 3 is:" + max);

        sc.close();
    }

}
