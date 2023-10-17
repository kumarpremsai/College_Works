import java.util.*;
public class HAQuestion04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit :");
        int a = sc.nextInt();
        int sum=0,p=1,i=1;
        for(i=1;i<=a;i++){
            if(i%2==0)
            sum+=i;
            else
            p*=i;
        }
        System.out.println("The sum of all even numbers between "+a+" is "+sum);
        System.out.println("The product of all odd numbers between "+a+" is "+p);
    }
}
