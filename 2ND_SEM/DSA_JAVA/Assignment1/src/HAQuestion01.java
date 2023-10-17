import java.util.*;
public class HAQuestion01 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter 1st number : ");
        int a = in.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = in.nextInt();
        System.out.print("Enter 3rd number : ");
        int c = in.nextInt();
        if((a+b)==c){
            System.out.println("This is in Arithmetic order ");
            System.out.println(a+"+"+b+"="+c);
        }
        if(a==(b-c)){
            System.out.println("This is in Arithmetic order ");
            System.out.println(a+"="+b+"-"+c);
        }
        if((a*b)==c){
            System.out.println("This is in Arithmetic order ");
            System.out.println(a+"*"+b+"="+c);
        }
        else{
            System.out.println("This is not in Arithmetic order ");
        }
    }
}
