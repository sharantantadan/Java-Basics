public class reversed{
    public static void main(String[]args){
        int n = 54321;
        int reversed =0;

        while(n>0){
            int digit = n%10;
            reversed=reversed*10+digit;
            n=n/10;
        }
    System.out.println("Reversed order is:"+ reversed);
    }
}