import java.util.*;
public class Question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int a = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a+"*"+i+"="+a*i);
        }
    }
}
