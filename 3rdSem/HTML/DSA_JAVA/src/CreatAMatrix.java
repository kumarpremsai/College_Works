import java.util.*;
public class CreatAMatrix{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Row size ");
        int row = in.nextInt();
        System.out.println("Enter Coloumn size ");
        int coloumn = in.nextInt();
        int matrix [][] = new int[row][coloumn];
        for(int i=1;i<row;i++){
            for(int j=1;j<coloumn;j++){
                System.out.print(+i+","+j+" ");
            }
            System.out.println();
        }
    }
}



// import java.util.*;
// public class CreatAMatrix{
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter matrix ");
//         System.out.print("Enter row : ");
//         int a = in.nextInt();
//         System.out.print("Enter coloumn : ");
//         int b = in.nextInt();
//         int rowsum=0,colsum=0;
//         int [][] matrix = new int[a][b];
//         for(int i=0;i<a;i++){
//             rowsum+=a;
//             for(int j=0;j<b;j++){
//                 colsum+=b;
//                 System.out.print("("+i+","+ j+")");
//             }
//             System.out.println();
//         }
//         System.out.println("Row sum is "+rowsum);
//         System.out.println("Coloumn sum is "+colsum);
//     }
// }