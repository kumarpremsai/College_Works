import java.util.*;
public class HAQuestion01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter minutes : ");
        int a = sc.nextInt();
        double year = a/525600;
        double day = (a%525600)/1440;
        System.out.println(a+" minutes is "+year+" years & "+day+" days ");
        //System.out.println(a+" minutes is "+a/525600+" years & "+(a%525600)/1440+" days ");

    }
}
