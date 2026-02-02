public class digitcount{
    public static void main(String[]args){
        int n =908070;
        int count=0;

        if(n==0){
            count=1;
        }else{
            while(n>0){
                n=n/10;
                count++;
            }
        }
                        System.out.println("No. of digits are:"+ count);

    }
}