import java.util.*;

import javax.sound.sampled.Line;
public class HAQuestion02 {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit ");
       int a = sc.nextInt(),sum=0;
        for(int i=1;i<=a;i++){
            if(i%3==0 || i%5==0){
                sum+=i;
               // System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
