
// class test {
//     static void update(int a[]){
//     a[0]=25;
//     }
// }
// public class method {
//     public static void main(String[] args) {
//         int a[]= {1,2,3,4,5,6,7,8};
//        test t=new test();
//        t.update(a);
//     System.out.println(a[0]);
//     }
// }


// package udemy;
// import java.util.*;
// public class method {
// public static int additionSimple(int x , int y){
//     return x+y;
// }

//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         int a = in.nextInt();
//         int b = in.nextInt();
//         System.out.println(additionSimple(a,b));
//     }
// }

// method practice 

// package udemy;
//     public class method{
//         static void change(int a[],int index,int value){
//             a[index]=value;
//         }
//         public static void main(String[] args) {
//             int a[] = {2,4,6,8,10};
//             change(a,4,20);
//             for(int x :a){
//                 System.out.println(x); 
//             }
//         }
//     }

import java.util.*;
public class method{
  static int max (int x , int y , int z){
  if(x>y && x>z){
    return x;
  }
  else if (y>z && y>x ){
    return y;
  }
  else{
    return z;
  }
  }
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("Enter 1st number : ");
    int a = in.nextInt();
    System.out.println("Enter 2nd number : ");
    int b = in.nextInt();
    System.out.println("Enter 3rd number : ");
    int c = in.nextInt();
    System.out.println("Maximum number is "+max(a,b,c));
  }
}