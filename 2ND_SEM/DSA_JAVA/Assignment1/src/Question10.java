import java.util.*;
public class Question10{
    public static double sumColoumn(int[][] m,int coloumnindex){
        double sum =0;
        for(int i=0;i<m.length;i++){
            sum+=m[i][coloumnindex];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of the elemnts of row : ");
        int r = in.nextInt();
        System.out.print("Enter the number of the elements of coloumn : ");
        int c = in.nextInt();
        int [][] matrix = new int [r][c];
        System.out.println("Enter the elements of the matrix......");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("Matrix is ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<c;i++){
            System.out.println("Sum of coloumn "+i+" "+sumColoumn(matrix, i));
        }
     }
}