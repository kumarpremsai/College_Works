import java.util.*;
public class Question01 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a positive integer greater than 2 : ");
        int a = in.nextInt();
        int count=0;
        while(a>2){
            a/=2;
            count++;
        }
        System.out.println("The number of times you must repeatedly divide this number by getting a value less than 2 is "+count);
    }
}