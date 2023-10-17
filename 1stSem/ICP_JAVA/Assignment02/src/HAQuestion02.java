import java.util.*;
public class HAQuestion02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of eggs : ");
        int a = sc.nextInt();
        int x = a/144;
        int y = (a%144)/12;
        int z = (a%144)%12;
        System.out.println(a+" eggs your number of eggs is "+x+" gross "+y+" dozon & "+z);
    }
}
