import java.util.*;
public class Question05{
    public static int sum_Of_Digits(int a){
        int sum = 0;
       while(a>9){
        while(a>0){
            int rem =a%10;
            sum+=rem;
            a/=10;
        }
        a=sum;
        sum=0;
       }
       return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number ");
        int x = in.nextInt();
        System.out.print("Sum of your entered digit is "+sum_Of_Digits(x));
    }   
}