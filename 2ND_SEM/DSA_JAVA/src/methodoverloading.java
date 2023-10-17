
import java.util.*;
public class methodoverloading {
    static int max (int x, int y){
        return x>y?x:y;
    }
    static long max(Long x , long y ){
        if(x>y)
        return x ;
        else
        return y ;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter the first integer number: ");
        // int x = in.nextInt();
        // System.out.println("Enter the second integer number: ");
        // int y = in.nextInt();
        // System.out.println(max(x,y));
        // System.out.println("Enter the first float number ");
        // float a = in.nextFloat();
        // System.out.println("Enter the second float number ");
        // float b = in.nextFloat();
        // System.out.println(max(x,y));
        // float x = in.nextFloat();
        // float y = in.nextFloat();
        // System.out.println("Float value is "+maxf(x,y));
        long a = in.nextLong();
        long b = in.nextLong();
        System.out.println(+max(a,b));
        
    }
}
