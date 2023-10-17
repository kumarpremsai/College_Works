import java.util.*;
public class Question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in seconds : ");
        int t = sc.nextInt();
        double g = 32.174;
        double d = (1.0/2)*g*Math.pow(t,2);
        System.out.println("Distance travelled "+d);
        //System.out.println("Distance travelled "+(1.0/2)*g*t*t);
    }
}
