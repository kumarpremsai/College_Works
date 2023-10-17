import java.util.Scanner;

class Phone{
	int areacode;
	int exchange;
	int number;
	void input() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the area code");
		areacode=sc.nextInt();
		System.out.println("Enter the exchange number ");
		exchange=sc.nextInt();
		System.out.println("Enter your number");
		number=sc.nextInt();
	}
	void display() {
		System.out.println("My number is "+"("+areacode+") "+exchange+"-"+number);
	}
}
public class Question01 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		int area=sc.nextInt();int ex=sc.nextInt();int num=sc.nextInt();
//		Phone p=new Phone();
//		p.areacode=123;p.exchange=345;p.number=2266;
//		Phone p2=new Phone();
//		p2.input(area, ex, num);
//		p2.display();
		Phone p3=new Phone();
		p3.input();
		p3.display();
		
	}

}
