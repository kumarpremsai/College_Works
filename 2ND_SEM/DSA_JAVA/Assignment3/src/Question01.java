// import java.util.*;
// public class Question01 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter 1st number : ");
//         int n = in.nextInt();
//         try{
//             if(n>0){
//                 System.out.println("Your lucky number is "+n);
//             }
//             else{
//                 throw new NumberFormatException(" This is a negetive number ");
//             }
//         }catch(NumberFormatException s){
//             System.out.println(s);
//         }
//     }
// }

import java.util.*;
public class Question01{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        try{
            if(n>0){
                System.out.println("Your lucky number is "+n);
            }
            else{
                throw new NumberFormatException("This is negetive number  ");
            }
        }catch(NumberFormatException s){
            System.out.println(s);
        }
    }
}