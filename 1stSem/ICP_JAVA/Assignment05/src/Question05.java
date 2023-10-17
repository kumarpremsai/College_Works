import java.util.*;
public class Question05 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int mul = 1;
        for(int i=2;i<=15;i++){
            System.out.println("The multiplication table of "+i+" is : ");
            System.out.println();
            for(int j=1;j<=10;j++){
                mul=i*j;
                System.out.println(i+"*"+j+"="+mul);
                System.out.println();
            }
        }
    }
}
