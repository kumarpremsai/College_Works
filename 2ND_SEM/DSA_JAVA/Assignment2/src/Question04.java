import java.util.*;
class Product{
	int pid;
	int price;
	static int tot_price;
	Product(){
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the product id");
		this.pid=in.nextInt();
		System.out.println("Enter the price of product");
		this.price=in.nextInt();
		tot_price+=price;
	}
	void display(){
		System.out.println("The product id is "+this.pid+" and price is  "+this.price);
	}
	
}
public class Question04 {

	public static void main(String[] args) {
		Product p[]=new Product[5];
		for(int i=0;i<5;i++) {
			p[i]=new Product();
			p[i].display();
		}
		System.out.println("The total amount is "+Product.tot_price);

	}

}
