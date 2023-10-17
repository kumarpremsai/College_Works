import java.util.*;
public class Question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter farenheit : ");
        int a = sc.nextInt();
        double b = ((a-32)*(5.0/9));
        System.out.println(a+" farenheit is "+b+" celsius ");
       // System.out.println(a+" farenheit in celsius is "+((a-32)*(5.0/9)));
    //    Scanner ac = new Scanner(System.in);
    //    System.out.println("Enter celcius : ");
    //    double p = sc.nextDouble();
    //    double q = (p*9.0/5)+32;
    //    System.out.println(p+" celsius in farenheit is "+q);

    }
}

