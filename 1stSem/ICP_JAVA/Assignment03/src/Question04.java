import java.util.*;
public class Question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter MIN range ");
        int a = sc.nextInt();
        System.out.println("Enter MAX range ");
        int b = sc.nextInt();
        System.out.println("Enter your number ");
        int z = sc.nextInt();
        int c = (int)((b-a)*Math.random()+a);
        System.out.println(c);
        if (z==c){
            System.out.println("You got right");
        }
        else if (z==(c+1)){
            System.out.println("You got one grater number");
        }
        else if(z==(z-1)){
            System.out.println("You got one lesser number ");
        }
        else{
            System.out.println("Try again ");
        }
    }
}
