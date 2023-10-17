import java.util.Scanner;

class Complex{
	int real;
	int imag;
	void setdata() {
		Scanner in = new Scanner (System.in);
		real=in.nextInt();
		imag=in.nextInt();
	}
	void display() {
		System.out.println(real+" "+imag);
	}
	Complex add(Complex c1,Complex c2) {
		Complex t=new Complex();
		t.real=c1.real+c2.real;
		t.imag=c1.imag+c2.imag;
		return t;
	}
}
public class Question02 {

	public static void main(String[] args) {
	Complex c1=new Complex();
//	c1.real=1;c1.img=2;
	c1.setdata();
	Complex c2=new Complex();
//	c2.real=8;c2.img=9;
	c2.setdata();
	Complex c = c1.add(c1,c2);
	c.display();
	}

}
