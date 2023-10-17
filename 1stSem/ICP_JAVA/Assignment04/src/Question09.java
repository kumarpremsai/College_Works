import java.util.*;
public class Question09{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = sc.nextInt();
        int rev1=0,rev2=0;
        while(a>0){
            int rem = a%10;
            if(rem!=0){
                rev1=rev1*10+rem;
            }
            a/=10;
        }
       // System.out.println(rev1);
        while(rev1>0){
            int rem=rev1%10;
            rev2=rev2*10+rem;
            rev1/=10;
        }
        System.out.println("The number after removing all the zeros is "+  rev2);
    }
}
   

// 2nd method.......
  
// import java.util.*;
// public class Question09{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number ");
//         int a = sc.nextInt();
//         int rev1=0,rev2=0;     
//           do{
//             int rem=a%10;
//             rev1=rev1*10+rem;
//             a/=10;
//           }while(a>0);
//           //System.out.println(rev1);
//           for(int i=0;rev1>0;i++){
//             int rem=rev1%10;
//             if(rem!=0){
//                 rev2=rev2*10+rem;
//             }
//             rev1/=10;
//         }
//         System.out.println(rev2);
//     }
// }