import java.util.*;
public class Question08 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the row size : ");
        int r = in.nextInt();
        System.out.print("Entr the coloumn size : ");
        int c = in.nextInt();
        int [][] matrix = new int[r][c];
        System.out.println("Enter the elements of the matrix ");
        //input array 
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            matrix [i][j] = in.nextInt();
            }
        }
        //output array 
        System.out.println("2D matrix is ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
