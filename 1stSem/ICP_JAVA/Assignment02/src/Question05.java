import java.util.*;
public class Question05 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of hemiasphere : ");
        int a = sc.nextInt();
        double area =(int) 3*Math.PI*(Math.pow(a,2));
        double volume = (int)(2.0/3*Math.PI*(a*a));
        System.out.println("Area of hemisphere is "+area);
        System.out.println("Volume of hemisphere is "+volume);
    }
}
