import java.util.*;
public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        int x,y,z;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if(x>y && y>z){
            System.out.println("It is in increasing order ");
        }
        else if(z>y && y>x){
            System.out.println("It is in decreasing order ");
        }
        else{
            System.out.println("It is neither increasing or decreasing order ");
        }
    }
}
