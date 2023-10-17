import java.util.*;
public class Question09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number ");
        int c = sc.nextInt();
        if (c>a && c>b){
            System.out.println(c+ " is the largest number ");
            if(b>a){
                System.out.println(b+" is the 2nd largest number ");
            }
            else{
                System.out.println(a+" is the 2nd largest number ");
            }
        }    
        if (b>a && b>c){
            System.out.println(b+" is ther largest number ");
            if(c>a){
                System.out.println(c+" is the 2nd largest number ");
            }
            else {
                System.out.println(a+" is the 2nd largest number ");
            }
        }
        if(a>b && a>c){
            System.out.println(a+" is the largest number ");
            if(c>b){
                System.out.println(c+" is the 2nd largest number ");
            }
            else {
                System.out.println(b+" is the 2nd highest number");
            }
        }
    }
}
