import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println("MUL:" + n * i);
        }

    }

}
