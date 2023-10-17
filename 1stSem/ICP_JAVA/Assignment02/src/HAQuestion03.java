import java.util.*;
public class HAQuestion03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st coordinates");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter 2nd coordinates");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Enter 3rd coordinates");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        double s ;
        double a = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        double b = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
        double c = Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2));
        s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)+(s-b)+(s-c));
        System.out.println("Area of tringle is "+area);
    }
}
