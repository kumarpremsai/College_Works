import java.util.*;
public class Question02 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the weight in kg : ");
        double a = in.nextDouble();
        System.out.print("Enter the height in meter : ");
        double b = in.nextDouble();
        double bmi = a/Math.pow(b,2);
        String s;
        if (bmi<18.5){
            s="Under Weight";
        }
        else if(bmi<24.9){
            s="Normal Weight ";
        }
        else if(bmi<29.9){
            s="Over Weight";
        }
        else{
            s="Obese";
        }
        System.out.println("The person is "+s);
    }
}
