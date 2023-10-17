import java.util.*;
public class HAQuestion02 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter how many lines you want to enter : ");
        int n = in.nextInt();
        System.out.println("Enter Lines : ");
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i] = in.nextLine();
        } 
        for(int i=n-1;i>=0;i--){
            System.out.println(str[i]);
        }
    }
}
