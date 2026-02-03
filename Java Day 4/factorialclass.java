import java.util.Scanner;

public class factorialclass {
   static int factorial(int n) {
      int result = 1;
      for (int i = 1; i <= n; i++) {
         result = result * i;
      }
      return result;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number :");
      int num = sc.nextInt();
      int ans = factorial(num);
      System.out.println("Factorial:" + ans);
      factorial(num);
      sc.close();
   }
}