import java.util.*;
public class Question01{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number ");
		int b = sc.nextInt();
		int sum=0,sum2=0;
		for(int i=1;i<=a;i++){
			if(a%i==0){
				sum+=i;
			}
		}
		//System.out.println(sum);
		for(int i=1;i<=b;i++){
			if(b%i==0){
				sum2+=i;
			}
		}
		
		//System.out.println(sum2);
		if(sum==sum2){
			System.out.println(a+" & "+b+" is an Amicable number ");
		}
		else{
			System.out.println(a+" & "+" is not an Amicable number ");
		}
	}
}