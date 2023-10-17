import java.util.*;
public class Question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit : ");
        int a = sc.nextInt();
        double b ;
        if(a<50){
          b = a*3.0;  
        }
        else if (a>=50 && a<200){
            b = (50*3)+(a-50)*4.80;
        }
        else if (a<=200 && a>400){
            b = ((50*30)+(200*5.80))+(a-200)*5.80;
        }
        else {
            b = ((50*3)+(200*4.80)+(400*5.80))+(a-400)*6.20;
        }
        System.out.println("Your bill is "+b);
    }
}
