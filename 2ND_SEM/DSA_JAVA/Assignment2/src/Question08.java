import java.util.Scanner;
interface DetailInfo
{
public void display();
public int count();
}
public class Question08 implements DetailInfo
{
private String name;
private static int maxcount = 0;
public Question08(String name)
{
this.name = name;
}
public void display() 
{
System.out.println("Name: " + name);
System.out.println("Number of characters in name: " + count());
}
public int count() 
{
int count = name.length();
if (count > maxcount) 
{
maxcount = count;
}
return count;
}
public static void main(String[] args) 
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the Name 1 : ");
String str1=in.nextLine();
System.out.println("Enter the Name 2 : ");
String str2=in.nextLine();
Question08 person1 = new Question08(str1);
Question08 person2 = new Question08(str2);
person1.display(); 
person2.display(); 
System.out.println("Max number of characters in a name: " + maxcount);
}
}
