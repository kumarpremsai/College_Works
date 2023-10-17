import java.util.*;
public class Question02{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the size of Array : ");
        int n = in.nextInt();
        String c[] = new String[n];
        System.out.print("Enter the elements of Array : ");
        for(int i=0;i<c.length;i++){
            c[i] = in.next();
        }
        try{
             int a = Integer.parseInt(c[0]);
        }
        catch(NumberFormatException a){
            System.out.println(a);
        }
        System.out.println("Enter one more colour ");
        try{
        c[n+1] = in.next();
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }
        System.out.println("Entered colours are ");
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}
