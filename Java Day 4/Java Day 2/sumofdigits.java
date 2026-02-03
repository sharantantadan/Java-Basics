public class sumofdigits{
    public static void main(String[]args){
        int n=908070;
        int sum=0;

        while(n>0){
            int digit = n%10;
            sum =sum + digit;
            n=n/10;
        }
        System.out.println("summ of digits are:"+sum);
    }
}