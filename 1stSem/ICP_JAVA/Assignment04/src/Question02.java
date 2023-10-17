import java.util.*;
public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        int sum=0;
        for(int i=0;i<=a;i++){
            int rem=a%10;
            sum+=rem;
            a/=10;
        }
        System.out.println("Sum the digit is "+sum);
        if(sum%9==0){
            System.out.println("This number is divisible by 9 ");
        }
        else {
            System.out.println("This number is not divisible by 9 ");
        }
    }
}
