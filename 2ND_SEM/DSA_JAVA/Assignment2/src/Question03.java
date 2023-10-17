import java.util.Scanner;

class Student{
	String name;int roll;int dm;
	void setdata() {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the name");
		name=sc.nextLine();
		System.out.println("Enter the roll");
		roll=sc.nextInt();
		System.out.println("Enter the dsa mark");
		dm=sc.nextInt();
	}
	void diplay() {
		System.out.println(name+" "+roll+" "+dm);
	}
}
public class Question03 {

	public static void main(String[] args) {
	Student s1=new Student();
	Student s2=new Student();
	Student s3=new Student();
	Student s4=new Student();
	Student s5=new Student();
	s1.setdata();
	s2.setdata();
	s3.setdata();
	s4.setdata();
	s5.setdata();
	int max=Math.max(s1.dm, Math.max(s2.dm, Math.max(s3.dm, Math.max(s4.dm, s5.dm))));
	if(s1.dm==max) {
		System.out.println(s1.name+" scored highest in dsa");
	}
	if(s2.dm==max) {
		System.out.println(s2.name+" scored highest in dsa");
	}
	if(s3.dm==max) {
		System.out.println(s3.name+" scored highest in dsa");
	}
	if(s4.dm==max) {
		System.out.println(s4.name+" scored highest in dsa");
	}
	if(s5.dm==max) {
		System.out.println(s5.name+" scored highest in dsa");
	}
	}

}
