import java.util.*;
public class HAQuestion05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 'N' : ");
        int n = sc.nextInt();
        String s = "  ";
        for(int i=1;i<=n;i++){
            s=s+i+s;
            System.out.println(s);
        }
    }
}
