import java.util.*;
public class Question10 {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range ");
        int a = sc.nextInt(),m=1;
        for(int i=1;3*i<=a;i*=3){
            m=m*3;
        }
        System.out.println(m);
    }
}
