public class SignEvenOdd{
    public static void main(String[]args){
        int a=-7;
        if(a>0 && a%2==0){
            System.out.println(a+"is a positive even number");
        
        }else if(a>0 && a%2!=0){
            System.out.println(a+"is a positive odd number");
        }else if(a<0 && a%2==0){
            System.out.println(a+"is a negative even number");
        }else if(a<0 && a%2!=0){
            System.out.println(a+"is a negative odd number");
        }else{
            System.out.println("Zero");

        }
    }
}