import java.util.*;
public class Question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int a = sc.nextInt();
        if(a<18){
            System.out.println("Your are not eligible for vote ");
        }
        else {
            System.out.println("You are eligible for vote ");
        }

    }
}
