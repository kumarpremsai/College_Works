import java.util.*;
public class HAQuestion01{
    public static void main(String[] args) {
        int sum1=0,sum2=0,s1=1,s2=1;
        for(int i=1;i<=10;i++){
            sum1+=i;
            s2=(int)Math.pow(i,2);
            sum2+=s2;
        }
        s1=(int)Math.pow(sum1,2);
        System.out.println(s1);
        System.out.println(sum2);
        System.out.println("Difference between the sum of the sqare of the first ten natural numbers & square of their sum is "+(s1-sum2));
    }
}

//2nd method...........

// import java.util.*;
// public class HAQuestion01{
//     public static void main(String[] args) {
//         int i=1;
//         int powsum=0;
//         while(i<=10){
//             powsum+=(int)Math.pow(i,2);
//             i++;
//             System.out.println("The sum of the sqare of the first ten natural number is "+powsum);
//             int j=1;
//             int sum=0;
//             while(j<=10){
//                 sum+=j;
//                 j++;
//             }
//             int x = (int)Math.pow(sum,2);
//             System.out.println("The sqare of thr sum of the first ten natural number is "+x);
//             System.out.println("The difference is "+(x-powsum));
//         }
//     }
// }