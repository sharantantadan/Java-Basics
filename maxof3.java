public class Maxof3{
    public static void main(String[]args){
        int a=5;
        int b=9;
        int c=9;

   if (a>b && a>c){
    System.out.println(a+"is the greatest of all");
   }else if (b>a && b>c){
    System.out.println(b+"is the greatest of all");
   }else if(c>a && c>b){
    System.out.println(c+"is the greatest of all");
   }else{
    System.out.println("More than 1 number is equal");
   }
    }
}