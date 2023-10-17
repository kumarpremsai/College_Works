import java.util.*;
public class Question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int a = sc.nextInt();
        System.out.print("Enter last number : ");
        int b = sc.nextInt();
        System.out.print("Enter increment factor : ");
        int c = sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i+=c){
            System.out.println(i);
            sum+=i;
        }
        System.out.println("Sum of the numbers is "+sum);
    }
}
