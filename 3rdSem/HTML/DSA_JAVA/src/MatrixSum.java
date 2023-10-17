import java.util.*;
public class MatrixSum{
    public static void main(String...args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter Row size ");
        int row = in.nextInt();
        System.out.println("Enter coloumn size ");
        int coloumn = in.nextInt();
        int rowsum=0,colsum=0;
        int matrix[][] = new int[row][coloumn];
        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                matrix [i][j] = in.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            rowsum+=row;
            for(int j=0;j<coloumn;j++){
                colsum+=coloumn;
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sumation of rows are "+rowsum);
        System.out.println("sumation of coloumns are "+colsum);
    }
}