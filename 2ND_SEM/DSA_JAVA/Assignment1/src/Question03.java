import java.util.*;
public class Question03 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a  number ");
        int a = in.nextInt();
        int rem=0,sum=0,product=1;
        while(a>0){
            rem=a%10;
            sum+=rem;
            product*=rem;
            a/=10;
        }
        System.out.println("The sum of the digits is "+sum);
        System.out.println("The product of the digits is "+product);
        if(sum==product){
            System.out.println("This is spy number");
        }
        else{
            System.out.println("This is not a spy number ");
        }
    }
}
