
class Deposit{
	long Principal;
	int time;
	double rate;
	double total_amt;
	Deposit(){
	System.out.println("Here is the deposit class :)");	
	}
	Deposit(long principal,int time,double rate){
		this.Principal=principal;
		this.time=time;
		this.rate=rate;
	}
	Deposit(long prin,int ti){
		Principal=prin;
		total_amt=ti;
	}
	Deposit(long p,double amount){
		Principal=p;
		total_amt=amount;
	}
	void diplay() {
		System.out.println("The principal amt is "+Principal+"\n The time given is  "+time+"\n The rate of interest is "+rate+"\n The total amount is  "+total_amt);
	}
	
}
public class Question05 {

	public static void main(String[] args) {
		Deposit d1=new Deposit(100000,2,5.6);
		d1.total_amt=d1.Principal+(d1.Principal*d1.rate*d1.time)/100.0;
		d1.diplay();

	}

}
