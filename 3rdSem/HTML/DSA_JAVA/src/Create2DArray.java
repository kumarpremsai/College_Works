// import java.util.*;
// public class Create2DArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Matrix ");
//         System.out.print("Enter Row size : ");
//         int a = sc.nextInt();
//         System.out.print("Enter Coloumn size : ");
//         int b = sc.nextInt();
//         int [][] matrix = new int[a][b];

//         // input the array 
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//              matrix[i][j] = sc.nextInt();
//             }
//         }
//         // input ended 
//         System.out.println("Matrix is ");
//         // output code 
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }


import java.util.*;
public class Create2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Matrix");
        System.out.println("Enter Row size ");
        int row = in.nextInt();
        System.out.println("Enter Coloumn size : ");
        int coloumn = in.nextInt();
        int matrix[][] = new int [row][coloumn];
        //inputMatrix
        System.out.println("Enter elements : ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix [i][j] = in.nextInt();
            }
        }
        System.out.println("Matrix is........ ");
        //outputMatrix
        
        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}