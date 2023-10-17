import java.util.*;
public class Question07{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit ");
        int a = sc.nextInt();
        double b ;
        double d ;
        if (a<50){
            b = a*3.0;
        }
        else if (a>=50 && a<200){
            b = (50*3)+(a-50)*4.80;
        }
        else if (a>=200 && a<400){
            b = ((50*3)+(200*4.80))+(a-200)*5.80;
        }
        else {
            b = ((50*3)+(200*4.80)+(400*5.80))+(a-400)*6.20;
        }
        System.out.println("Your bill is "+b);
        System.out.println("Do you wnat to pay through online (y/n)");
        char ch = sc.next().charAt(0);
        if (ch=='y' || ch=='Y'){
            d= (0.03)*b;
            System.out.println("Your discount is "+d);
            System.out.println("Your bill after discount is "+(b-d));
        }
        else{
            System.out.println("Your final bill is "+b);
        }
    }
}