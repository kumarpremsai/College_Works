import java.util.*;
public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ammount of water in ml : ");
        int x = sc.nextInt();
        if(x>=500){
            System.out.println("Alice follows doctors advice ");
        }
        else {
            System.out.println("Alice doesn't follow doctors advice");
        }
    }
}
