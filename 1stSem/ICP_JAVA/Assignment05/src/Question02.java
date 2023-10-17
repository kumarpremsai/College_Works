// import java.util.*;
// public class Question02{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         int rev=0,count=0,count2=0;
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 count++;
//             }
//         }
//            if(count==2){
//             System.out.println("Entered number is a prime number ");
        
//             while(n>0){
//                 int rem=n%10;
//                 rev=rev*10+rem;
//                 n/=10;
//             }
//             System.out.println("The reversse number is "+rev);
//             for(int i=1;i<=rev;i++){
//                 if(rev%i==0){
//                     count2++;
//                 }
//             }
//         if(count2==2){
//             System.out.println(rev+" & "+n+" is a twisted prime number ");
//         }
//         else{
//             System.out.print(rev+" is not a twisted prime number ");
//         }
//         }
//         else{
//             System.out.println(n+" is not a prime number ");
//         }
//     }
// }


import java.util.*;
public class Question02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre a number ");
        int a = sc.nextInt();
        int rev1=0,rev2,count1=0,count2=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count1++;
            }
        }
        if(count1==2){
            System.out.println("This is a prime number ");
            while(a>0){
                int rem=a%10;
                rev1=rev1*10+rem;
                a/=10;
            }
            System.out.println("The reverse number is "+rev1);
            int i=1;
            do{
                if(rev1%i==0){
                    count2++;
                }
            }while(i<=a);
            if(count2==count1){
                System.out.println("This is a twisted prime number");
            }
            else{
                System.out.println("This is not a twisted prime number ");
            }
        }
        else{
            System.out.println("This is not a prime number ");
        }
    }
}