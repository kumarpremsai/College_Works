import java.util.*;
public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //    System.out.println("Enter the limit of avg numbers : ");
    //    int x = sc.nextInt(),sum=0;
    //     for(int i=0;i<=x;i++){
    //         int r = (int)(Math.random()*x)+1;
    //         System.out.println(r);
    //         sum+=r;
    //     }System.out.println("Sum of the random number is "+sum);
    //     double avg = 1.0*sum/x;
    //     System.out.println("The average of random numeber is "+avg);
    // }
        System.out.print("Enter the limit of the average random number : ");
        int x = sc.nextInt(),sum=0,i=0;
        do{
            int r = (int)(Math.random()*x)+1;
            System.out.println(r);
            sum+=r;
            i++;
        }while(i<=x);
        System.out.println("Sum of the random numbers is "+sum);
        double average = 1.0*sum/x;
        System.out.println("The average of random number is "+average);
       
    }
}
