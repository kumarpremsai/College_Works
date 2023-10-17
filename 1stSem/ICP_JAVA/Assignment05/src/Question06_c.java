import java.util.*;
public class Question06_c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
