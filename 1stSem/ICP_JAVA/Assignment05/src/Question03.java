import java.util.*;
public class Question03{
    public static void main(String...args){
        Scanner s = new Scanner (System.in);
        System.out.print("Enter 1st number ");
        int a = s.nextInt();
        System.out.print("Enter 2nd number ");
        int b = s.nextInt();
        int rev =0,count1=0;
        for(int j=a;j<=b;j++){
        for(int i=1;i<=b;i++){
            int rem = a%i;
            if(a%i==0){
                 count1++;
            }
            if(count1==2){
                System.out.println(a);
            }
        }
      }
    }
}

