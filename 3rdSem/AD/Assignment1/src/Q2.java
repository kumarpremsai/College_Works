import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of the elements:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the numbers");
        for (int i = 0; i < n ; i++) {
            arr[i]=sc.nextInt();

        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
               max=arr[i];

            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("maximum value is:"+max);
        System.out.println("minimum value is:"+min);
    }
    
}
