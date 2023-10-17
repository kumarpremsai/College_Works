import java.util.*;
public class HAQuestion03 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the number of elements of Array A : ");
        int a = in.nextInt();
        System.out.println("Enter the elemnest of Array A : ");
        int A[] = new int [a];
        for(int i=0;i<a;i++){
            A[i] = in.nextInt();
        }
        System.out.print("Enter the number of the elemnets of Array B : ");
        int b = in.nextInt();
        System.out.println("Enter the elements of the Array B : ");
        int B[] = new int [b];
        for(int i=0;i<b;i++){
            B[i] = in.nextInt();
        }
       // int c=1 ;
        int C[] = new int [A.length];
        System.out.print("The Product of "+A+" & "+B+" is : ");
        for(int i=0;i<A.length;i++){
            // c = A[i]*B[i];
            C[i]=A[i]*B[i];
        }
        for(int i=0;i<C.length;i++){
            System.out.print(C[i]+" ");
        }
    }
}