import java.util.*;
public class Question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in between 0-1000 : ");
        int a = sc.nextInt();
        int rem1 = a%10;
        a=a/10; // a/=10;
        int rem2 = a%10;
        a=a/10; 
        int rem3 = a%10;
        double sum = rem1+rem2+rem3;
        System.out.println("Sum of "+a+" is "+sum);
        //System.out.println("Sum of "+a+" is "+(rem1+rem2+rem3));
    }
}
