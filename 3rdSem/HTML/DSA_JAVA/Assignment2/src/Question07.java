import java.util.*;
class Person{
	String name;
	int age;
	Person(String s,int a){
		name=s;
		age=a;
	}
}
class Employee extends Person{
	int eid;int salary;

	Employee(String s, int a,int e,int sa) {
		super(s,a);
		eid=e;
		salary=sa;
	}
	void display() {
		System.out.println("the name is "+name+" \n The age is "+age+" \n the eid is "+eid+"\n the salary is "+salary);
	}
	
}
public class Question07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter employee name");
		String s=sc.nextLine();
		System.out.println("Enter the age");
		int n=sc.nextInt();
		System.out.println("Enter the id");
		int i=sc.nextInt();
		System.out.println("Enter the salary");
		int ss=sc.nextInt();
		Employee e=new Employee(s,n,i,ss);
		e.display();
	}

}
