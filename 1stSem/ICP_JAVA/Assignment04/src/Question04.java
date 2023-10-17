import java.util.*;
public class Question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        while(a%b!=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        System.out.println("GCD is "+b);
    }
}
