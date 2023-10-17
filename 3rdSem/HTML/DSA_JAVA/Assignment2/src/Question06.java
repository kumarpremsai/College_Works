import java.util.*;
abstract class Shape{
	int l;
	int b;
	int h;
	int r;
	abstract void area() ;
	
	
}
class Square extends Shape{

	@Override
	void area() {
		double are= (l*l);
		System.out.println(are);
	}
}
class triangle extends Shape{
	@Override
	void area() {
		double are=(0.5)*b*h;
		System.out.println(are);
	}
	
}
class circle extends Shape{
	void area() {
		double are=(3.14)*r*r;
		System.out.println(are);
	}
}
public class Question06 {

	public static void main(String[] args) {
		triangle t=new triangle();
		System.out.println("The area of triangle is ");
		t.b=5;t.h=6;
		t.area();
		System.out.println("The area of the square is ");
		Square s=new Square();
		s.l=4;
		s.area();
		System.out.println("The area of circle is ");
		circle c=new circle();
		c.r=5;
		c.area();
		
		

	}

}
