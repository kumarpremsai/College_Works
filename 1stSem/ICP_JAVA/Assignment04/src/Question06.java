import java.util.*;
public class Question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int a = sc.nextInt();
        System.out.println("Enter power ");
        int b = sc.nextInt();
        int x=1 ;
        for(int i=1;i<=b;i++){
           x*=a;
        }
        System.out.println(x);
    }
}