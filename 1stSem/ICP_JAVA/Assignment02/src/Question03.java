import java.util.*;
public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary : ");
        int a = sc.nextInt();
        double DA = 0.04*a;
        double HRA = 0.02*a;
        System.out.println("DA is "+DA);
        System.out.println("HRA is "+HRA);

    }
}
