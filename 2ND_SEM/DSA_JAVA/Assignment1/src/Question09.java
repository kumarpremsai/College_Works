import java.util.*;
public class Question09 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double [][] matrix = new double[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matrix [i][j] = in.nextDouble();
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of the major diagonal is "+sumMajorDigonals(matrix));
    }
    public static int sumMajorDigonals(double[][]m){
        int sum=0;
        for(int i=1;i<m.length;i++){
            sum+=m[i][i];
        }
        return sum; 
    }
}
