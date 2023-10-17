import java.util.*;
public class Question05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int a = sc.nextInt();
        if(a%4==0 && a%100==0 && a%400==0){
            System.out.println("This is a leap year ");
        }
        else{
            System.out.println("This is not a leap year ");
        }
    }
}
