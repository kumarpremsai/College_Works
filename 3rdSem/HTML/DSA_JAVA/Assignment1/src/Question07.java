import java.util.*;
public class Question07 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter ther range of the array ");
        int r = in.nextInt();
        int [] arr = new int [r];
        System.out.println("The elements of Array are : ");
        for(int i=0;i<r;i++){
            arr[i] = in.nextInt();
        }
        int max = arr[0];
            int min = arr[0];
            int maxCount=1,minCount=1,maxFirst=0,minLast=0;
            for(int i=1;i<arr.length;i++){
                if(arr[i]>max){
                    max = arr[i];
                    maxCount=1;
                    maxFirst=i;
            }
            else if(arr[i]==max){
                maxCount++;
                if (arr[i]<min){
                    min = arr[i];
                    minCount=1;
                    minLast=i;
                }
                else if(arr[i]==min){
                    minCount++;
                    minLast=i;
                }
            }
            System.out.println("Maximum value : "+max);
            System.out.println("Minimum value : "+min);
            System.out.println("Maximum count : "+maxCount);
            System.out.println("Minimum count : "+minCount);
            System.out.println("Maximum first element : "+maxFirst);
            System.out.println("Minimum last element : "+minLast);
        }
    }
}
