import java.util.*;
public class Question06 {
   public static boolean isOdd (int a ){
    while(a>0){
        if(a!=0){
            a-=2;
        }
    }
    if((a & 1)==1){
        return true ; 
    }
    else {
        return false ;
    }
   }
   public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Enter a number : ");
    int a = input.nextInt();
    System.out.println("This number is odd "+"("+isOdd(a)+")");
   }
}
