import java.util.*;
public class Question08{
    public static void main(String[] args) {
        for(;;){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int b = (int)(Math.random()*10)+1;
        System.out.println(b);
        int a = sc.nextInt();
        if(a==b){
            System.out.println("Your guess is correct ");
            break;
        }
        if(a<b){
            System.out.println("Your guess is low ");
        }
        else{
            System.out.println("Your guess is high ");
        }
    }
}
}