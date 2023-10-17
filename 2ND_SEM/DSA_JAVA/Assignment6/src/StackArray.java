import java.util.*;
public class StackArray {
	public static final int MAX = 5;
    public static int push(int S[], int top)
    {
        Scanner sc = new Scanner(System.in);
        if(isFull(top))
            System.out.println("Stack Overflow, Insert not possible");
        else
        {
            System.out.println("Enter a data to be add: ");
            top++;
            S[top] = sc.nextInt();
        }
        return top;
    }
    public static int pop(int S[], int top)
    {
        if(isEmpty(top))
         System.out.println("Stack underflow, delete not possible");
        else
        {
            System.out.println("Deleted item is: "+S[top]);
            top--;
        }
        return top;
    }
    public static void display(int S[], int top)
    {
        if(top==-1)
         System.out.println("Empty stack");
        else
        {
            int i = top;
            System.out.println("Array elements are: ");
            while(i>=0)
            {
                System.out.print(S[i]+" ");
                i--;
            }
            System.out.println();
        }
    }
    public static boolean isFull(int top)
    {
        return top==MAX-1;
    }
    public static boolean isEmpty(int top)
    {
        return top==-1;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for creating stack using array");
		int[] S = new int[MAX];
		int top = -1;
		while(true)
		{
			System.out.println("Manu for different operation");
			System.out.println("Press 0: Exit");
			System.out.println("Press 1: Push");
			System.out.println("Press 2: Pop");
			System.out.println("Press 3: Display");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 0: System.exit(0);
			case 1: top = push(S,top);
			        break;
			case 2: top = pop(S,top);
			        break;
			case 3: display(S,top);
	        		break;
			default: System.out.println("Wrong choice, try again");
			}
		}
	}
}