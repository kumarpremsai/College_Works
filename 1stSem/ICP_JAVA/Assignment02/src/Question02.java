import java.util.*;
public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in KM : ");
        int a = sc.nextInt();
        double meter = a*1000;
        double centimeter = a*100000;
        double feet =a*3280.8399;
        double inch = a*39370.0787;
        System.out.println(a+" KM is "+meter+" meter ");
        System.out.println(a+" KM is "+centimeter+" centimeter ");
        System.out.println(a+" KM is "+feet+" feet ");
        System.out.println(a+" KM is "+inch+" inch ");

    }
}
