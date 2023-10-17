import java.util.*;
public class Question04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = input.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = input.nextInt();
        for(int i=a;i<=b;i++){
            int f=i;
            for(int j=1;j<i;j++){
                f*=j;
            }
            System.out.println("The factorial of "+i+" is "+f);
        }
    }
}
