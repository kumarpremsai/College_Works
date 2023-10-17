
import java.util.Scanner;
class Node
{
	int info;
	Node next;
}
public class StackLinkedList {
	public static Node push(Node top)
	{
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number of new node: ");
		int data = sc.nextInt();
		Node node = new Node();
		node.info = data;
		node.next = top;
		top = node;
		return top;
	}
	public static Node pop(Node top)
	{
		if(top==null)
    	{
    		System.out.println("Stack underflow, delete not possible");
    	}
    	else
    	{
    		Node q = top;
    		top = top.next;
    		System.out.println("Deleted node info-- data value: "+q.info);
    	}
		return top;
	}
	public static void display(Node top)
    {
    	Node p = top;
    	if(top==null)
    	{
    		System.out.println("Stack underflow");
    	}
    	else
    	{
    		System.out.println("Node details: \t value");
    		while(p!=null)
    		{
    			System.out.println(" \t\t "+p.info);
    			p = p.next;
    		}
    	}
    }	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Node top = null;
		System.out.println("Program for creating single linkedlist");
		while(true)
		{
			System.out.println("Manu for different operation");
			System.out.println("Press 0: Exit");
			System.out.println("Press 1: push");
			System.out.println("Press 2: pop");
			System.out.println("Press 3: display");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 0: System.exit(0);
				case 1: top = push(top);
			        	break;
				case 2: top = pop(top);
			        	break;
				case 3: display(top);
	        			break;
				default: System.out.println("Wrong choice, try again");
			}
		}
	}
}